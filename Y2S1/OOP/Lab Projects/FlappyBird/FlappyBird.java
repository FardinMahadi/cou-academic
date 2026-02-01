import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {
    private int boardWidth, boardHeight;
    private double scale;

    class Bird {
        int x, y, width, height;
        Bird(int x, int y, int w, int h) {
          this.x = x;
          this.y = y;
          this.width = w;
          this.height = h;
        }
    }

    class Pipe {
        int x, y, width, height;
        boolean passed = false;
        Pipe(int x, int y, int w, int h) {
          this.x = x;
          this.y = y;
          this.width = w;
          this.height = h;
        }
    }

    private Bird bird;
    private int score = 0;
    private ArrayList<Pipe> pipes;
    private boolean gameOver = false;
    private double speedMultiplier = 1.0;
    private Timer gameLoop, placePipesTimer;
    private double velocityY = 0, gravity, jumpStrength;

    // --- DAY/NIGHT & TIME VARIABLES ---
    private double dayTime = 0.2; // Starts in the morning
    private boolean isDay = true;
    private ArrayList<Point> stars;
    private double layer1Offset = 0, layer2Offset = 0, layer3Offset = 0;

    FlappyBird() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.boardHeight = (int) (screenSize.height * 0.75);
        this.boardWidth = (int) (boardHeight * (9.0 / 16.0));
        this.scale = boardHeight / 640.0;

        this.gravity = 0.4 * scale;
        this.jumpStrength = -8 * scale;

        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setFocusable(true);
        addKeyListener(this);

        bird = new Bird(boardWidth / 8, boardHeight / 2, (int)(38 * scale), (int)(28 * scale));
        pipes = new ArrayList<>();

        stars = new ArrayList<>();
        for(int i=0; i<50; i++) stars.add(new Point((int)(Math.random()*boardWidth), (int)(Math.random()*boardHeight*0.6)));

        placePipesTimer = new Timer(1600, e -> placePipes());
        placePipesTimer.start();
        gameLoop = new Timer(1000 / 60, this);
        gameLoop.start();
    }

    public void placePipes() {
        int pipeW = (int)(66 * scale);
        int pipeH = (int)(512 * scale);
        int gap = (int)(160 * scale);
        int randomY = (int) (-pipeH / 2 - Math.random() * (pipeH / 2));
        pipes.add(new Pipe(boardWidth, randomY, pipeW, pipeH));
        pipes.add(new Pipe(boardWidth, randomY + pipeH + gap, pipeW, pipeH));
        placePipesTimer.setDelay(Math.max((int)(1600 / speedMultiplier), 650));
    }

    private Color lerp(Color c1, Color c2, float f) {
        int r = (int)(c1.getRed() + f*(c2.getRed()-c1.getRed()));
        int g = (int)(c1.getGreen() + f*(c2.getGreen()-c1.getGreen()));
        int b = (int)(c1.getBlue() + f*(c2.getBlue()-c1.getBlue()));
        return new Color(r, g, b);
    }

    private void drawCelestialBody(Graphics2D g2) {
        // Celestial path (an arc)
        double angle = Math.PI + (dayTime * Math.PI);
        int radius = (int) (boardWidth * 0.8);
        int cx = boardWidth / 2;
        int cy = boardHeight;

        int x = cx + (int) (Math.cos(angle) * radius);
        int y = cy + (int) (Math.sin(angle) * radius);

        if (isDay) {
            // Sun
            g2.setColor(new Color(255, 255, 0, 200));
            g2.fillOval(x - (int)(30*scale), y - (int)(30*scale), (int)(60*scale), (int)(60*scale));
            g2.setColor(Color.YELLOW);
            g2.fillOval(x - (int)(20*scale), y - (int)(20*scale), (int)(40*scale), (int)(40*scale));
        } else {
            // Moon
            g2.setColor(new Color(240, 240, 255));
            g2.fillOval(x - (int)(20*scale), y - (int)(20*scale), (int)(40*scale), (int)(40*scale));
            g2.setColor(new Color(0,0,0,50)); // Moon Shadow/Crescent
            g2.fillOval(x - (int)(10*scale), y - (int)(25*scale), (int)(40*scale), (int)(40*scale));
        }
    }

    private void drawUI(Graphics2D g2) {
        // Digital Clock logic
        int totalMinutes = (int) (dayTime * 720); // 12 hours = 720 mins
        int hours = (totalMinutes / 60) == 0 ? 12 : (totalMinutes / 60);
        int minutes = totalMinutes % 60;
        String period = isDay ? " AM" : " PM";
        String timeStr = String.format("%02d:%02d%s", hours, minutes, period);

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Monospaced", Font.BOLD, (int)(20 * scale)));
        g2.drawString(timeStr, boardWidth - (int)(120 * scale), (int)(40 * scale));

        g2.setFont(new Font("Arial", Font.BOLD, (int)(40 * scale)));
        g2.drawString("" + score, boardWidth/2 - 15, (int)(80 * scale));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        float intensity = (float) Math.sin(dayTime * Math.PI);
        Color skyT = isDay ? lerp(new Color(15, 25, 60), new Color(30, 110, 200), intensity) : lerp(new Color(30, 110, 200), new Color(5, 5, 15), intensity);
        Color skyB = isDay ? lerp(new Color(60, 80, 120), new Color(160, 230, 255), intensity) : lerp(new Color(160, 230, 255), new Color(15, 15, 35), intensity);

        g2d.setPaint(new GradientPaint(0, 0, skyT, 0, boardHeight, skyB));
        g2d.fillRect(0, 0, boardWidth, boardHeight);

        if(!isDay || intensity < 0.4) {
            g2d.setColor(new Color(255,255,255, (int)((1-intensity)*255)));
            for(Point s : stars) g2d.fillOval(s.x, s.y, 2, 2);
        }

        drawCelestialBody(g2d);

        drawMountainLayer(g2d, layer1Offset, isDay ? new Color(90, 110, 140) : new Color(25, 30, 50), 220, 0.4);
        drawMountainLayer(g2d, layer2Offset, isDay ? new Color(70, 95, 120) : new Color(20, 25, 40), 160, 0.6);
        drawMountainLayer(g2d, layer3Offset, isDay ? new Color(50, 80, 100) : new Color(15, 20, 30), 100, 0.8);

        for (Pipe p : pipes) drawPipe(g2d, p);
        drawBird(g2d);
        drawUI(g2d);

        if (gameOver) {
            g2d.setColor(new Color(0,0,0,160)); g2d.fillRect(0,0,boardWidth, boardHeight);
            g2d.setColor(Color.WHITE); g2d.drawString("CRASHED", boardWidth/4, boardHeight/2);
        }
    }

    private void drawMountainLayer(Graphics2D g2, double offset, Color c, int h, double curveVar) {
        g2.setColor(c);
        for (int i = 0; i < 2; i++) {
            int xBase = (int) (i * boardWidth - offset);
            int yBase = boardHeight - (int)(h * scale);
            Path2D.Double path = new Path2D.Double();
            path.moveTo(xBase, boardHeight);
            path.lineTo(xBase, yBase);
            path.quadTo(xBase + (boardWidth * 0.5), yBase - (int)(40 * curveVar * scale), xBase + boardWidth, yBase);
            path.lineTo(xBase + boardWidth, boardHeight);
            path.closePath();
            g2.fill(path);
        }
    }

    private void drawPipe(Graphics2D g2, Pipe p) {
        g2.setPaint(new GradientPaint(p.x, 0, new Color(40, 160, 40), p.x + p.width, 0, new Color(160, 240, 160)));
        g2.fillRect(p.x, p.y, p.width, p.height);
        g2.setColor(new Color(0, 60, 0));
        g2.drawRect(p.x, p.y, p.width, p.height);
        int capH = (int)(25 * scale);
        int capY = (p.y < 0) ? p.y + p.height - capH : p.y;
        g2.fillRect(p.x - 4, capY, p.width + 8, capH);
        g2.drawRect(p.x - 4, capY, p.width + 8, capH);
    }

    private void drawBird(Graphics2D g2) {
        AffineTransform old = g2.getTransform();
        g2.translate(bird.x + bird.width / 2, bird.y + bird.height / 2);
        g2.rotate(Math.toRadians(Math.max(-20, Math.min(velocityY * 4, 90))));
        int dx = -bird.width / 2, dy = -bird.height / 2;
        g2.setColor(Color.YELLOW); g2.fillOval(dx, dy, bird.width, bird.height);
        g2.setColor(Color.WHITE); g2.fillOval(dx + (int)(22*scale), dy + (int)(4*scale), (int)(12*scale), (int)(12*scale));
        g2.setColor(Color.BLACK); g2.fillOval(dx + (int)(29*scale), dy + (int)(7*scale), (int)(4*scale), (int)(4*scale));
        g2.setColor(Color.ORANGE); g2.fillArc(dx + (int)(26*scale), dy + (int)(12*scale), (int)(16*scale), (int)(10*scale), -90, 180);
        int wingOsc = (int) (Math.sin(System.currentTimeMillis() / 80.0) * 6 * scale);
        g2.setColor(new Color(255,255,255,220));
        g2.fillOval(dx+4, dy+10 - (wingOsc/2), (int)(20*scale), (int)(10*scale) + wingOsc);
        g2.setTransform(old);
    }

    public void move() {
        dayTime += 0.0005; // Clock Speed
        if(dayTime >= 1.0) { dayTime = 0; isDay = !isDay; }

        if (speedMultiplier < 2.2) speedMultiplier += 0.0004;
        double moveSpeed = (4.5 * scale) * speedMultiplier;

        layer1Offset = (layer1Offset + (0.5 * scale) * speedMultiplier) % boardWidth;
        layer2Offset = (layer2Offset + (1.2 * scale) * speedMultiplier) % boardWidth;
        layer3Offset = (layer3Offset + (2.0 * scale) * speedMultiplier) % boardWidth;

        velocityY += gravity; bird.y += velocityY;

        for (int i = 0; i < pipes.size(); i++) {
            Pipe p = pipes.get(i); p.x -= moveSpeed;
            if (bird.x < p.x + p.width && bird.x + bird.width > p.x && bird.y < p.y + p.height && bird.y + bird.height > p.y) gameOver = true;
            if (!p.passed && i % 2 == 0 && bird.x > p.x + p.width) { p.passed = true; score++; }
        }
        if (bird.y > boardHeight || bird.y < 0) gameOver = true;
        pipes.removeIf(p -> p.x + p.width < 0);
    }

    @Override public void actionPerformed(ActionEvent e) { if (!gameOver) { move(); repaint(); } }
    @Override public void keyPressed(KeyEvent e) { if (e.getKeyCode() == KeyEvent.VK_SPACE) { velocityY = jumpStrength; if (gameOver) restart(); } }
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}

    private void restart() {
        bird.y = boardHeight / 2; velocityY = 0; pipes.clear(); score = 0; speedMultiplier = 1.0; dayTime = 0.2; isDay = true;
        gameOver = false;
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Uronto Pakhi: Chronos Edition");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new FlappyBird()); f.pack(); f.setLocationRelativeTo(null); f.setVisible(true);
    }
}
