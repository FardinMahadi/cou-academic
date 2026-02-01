import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModernScientificCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operator = "";
    private double firstNum = 0;
    private boolean startNewNumber = true;

    // Modern Color Palette
    Color bgDark = new Color(33, 33, 33);
    Color btnNumber = new Color(66, 66, 66);
    Color btnOperator = new Color(255, 152, 0); // Orange
    Color btnScientific = new Color(117, 117, 117);
    Color textWhite = Color.WHITE;

    public ModernScientificCalculator() {
        setTitle("Modern Calculator");
        setSize(350, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(bgDark);
        setLayout(new BorderLayout(10, 10));

        // Display area with padding
        display = new JTextField("0");
        display.setFont(new Font("SansSerif", Font.PLAIN, 40));
        display.setBackground(bgDark);
        display.setForeground(textWhite);
        display.setBorder(new EmptyBorder(20, 10, 20, 10));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Grid of buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 8, 8)); // 6 rows, 4 columns
        panel.setBackground(bgDark);
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        String[] buttons = {
            "C", "sqrt", "log", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "sin", "0", ".", "=",
            "cos", "tan", "exp", "^"
        };

        for (String text : buttons) {
            JButton btn = createStyledButton(text);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
    }

    private JButton createStyledButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("SansSerif", Font.BOLD, 16));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setForeground(textWhite);

        // Color coding logic
        if (text.matches("[0-9.]")) {
            btn.setBackground(btnNumber);
        } else if (text.equals("=")) {
            btn.setBackground(btnOperator);
        } else if ("+/-*".contains(text)) {
            btn.setBackground(new Color(85, 85, 85));
        } else {
            btn.setBackground(btnScientific);
        }

        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9.]")) {
            if (startNewNumber) {
                display.setText(cmd);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + cmd);
            }
        } else if (cmd.equals("C")) {
            display.setText("0");
            startNewNumber = true;
        } else if (cmd.equals("=")) {
            calculate(Double.parseDouble(display.getText()));
            operator = "";
            startNewNumber = true;
        } else if ("sqrt log sin cos tan exp".contains(cmd)) {
            performScientific(cmd);
        } else {
            firstNum = Double.parseDouble(display.getText());
            operator = cmd;
            startNewNumber = true;
        }
    }

    private void performScientific(String cmd) {
        double num = Double.parseDouble(display.getText());
        double result = switch (cmd) {
            case "sqrt" -> Math.sqrt(num);
            case "log"  -> Math.log10(num);
            case "sin"  -> Math.sin(Math.toRadians(num));
            case "cos"  -> Math.cos(Math.toRadians(num));
            case "tan"  -> Math.tan(Math.toRadians(num));
            case "exp"  -> Math.exp(num);
            default     -> 0;
        };
        display.setText(String.valueOf(result));
        startNewNumber = true;
    }

    private void calculate(double secondNum) {
        double result = switch (operator) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> firstNum / secondNum;
            case "^" -> Math.pow(firstNum, secondNum);
            default  -> secondNum;
        };
        display.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        try {
            // Set System Look and Feel for better button rendering
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ignored) {}
        new ModernScientificCalculator();
    }
}
