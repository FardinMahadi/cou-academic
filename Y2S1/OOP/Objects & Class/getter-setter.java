// Simple example of encapsulation with getter and setter
class Circle {
    // Private field (hidden state)
    private double radius = 1.0;

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter with basic validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Default radius: " + c.getRadius());

        c.setRadius(5.5);
        System.out.println("Updated radius: " + c.getRadius());

        c.setRadius(-3); // ignored by validation
        System.out.println("After invalid update: " + c.getRadius());
    }
}