class Circle {
    double radius = 1.0;

    // Default constructor
    Circle() {
        radius = 5.0;
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Sum {
    static void printNew(int a) {
        System.out.println("Value: " + a);
    }

    // Method Overloading: 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method Overloading: 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method Overloading: Array of integers
    int add(int[] s) {
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
        }
        return sum;
    }
}

public class ICT15 {
    public static void main(String[] args) {
        // 1. Circle Test
        Circle c1 = new Circle(); // Uses default (5.0)
        Circle c2 = new Circle(10); // Uses 10.0

        System.out.println("Area (c1): " + c1.getArea());
        System.out.println("Area (c2): " + c2.getArea());

        // 2. Sum/Method Overloading Test
        int[] a = { 1, 2, 3, 4, 5, 6 };
        Sum s = new Sum();

        System.out.println("Sum of 2 numbers: " + s.add(4, 5));
        System.out.println("Sum of 3 numbers: " + s.add(4, 5, 6));

        // FIX: Calling the array sum method instead of printing the array object
        // address
        System.out.println("Sum of array: " + s.add(a));

        // Demonstrating the static method
        Sum.printNew(100);
    }
}