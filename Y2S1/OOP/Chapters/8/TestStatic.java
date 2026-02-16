public class TestStatic {
    public static void main(String[] args) {
        System.out.println("Before creating objects:");
        System.out.println("Number of circles: " + CircleWithStaticMembers.numberOfObjects);

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("\nAfter creating c1:");
        System.out.println("c1: radius = " + c1.radius + ", count = " + c1.numberOfObjects);

        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius = 9;
        
        System.out.println("\nAfter creating c2 and modifying c1:");
        System.out.println("c1: radius = " + c1.radius + ", count = " + c1.numberOfObjects);
        System.out.println("c2: radius = " + c2.radius + ", count = " + c2.numberOfObjects);
        System.out.println("Class level count: " + CircleWithStaticMembers.numberOfObjects);
    }
}

class CircleWithStaticMembers {
    double radius;
    /** The number of objects created */
    static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    CircleWithStaticMembers() {
        radius = 1.0;
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return numberOfObjects */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
}
