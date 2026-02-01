class Circle {
    double radius = 1.0;

    double getArea() {
        return Math.PI * radius * radius;
    }

    Circle() {
    }

    Circle(double radius) {
            this.radius = radius;
    }
}


class Demo {
        public static void main(String[] args) {
        Circle myCircle = new Circle(20);
        System.out.println("Area of circle with radius 20: " + myCircle.getArea());

        Circle myCircle2 = new Circle();
        System.out.println("Area of circle with radius 1: " + myCircle2.getArea());
    }
}