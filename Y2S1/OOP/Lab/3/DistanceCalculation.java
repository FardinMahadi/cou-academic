public class DistanceCalculation {
    public static void main(String[] args) {
        double[][] points = {
                { -1, 0, 3 },
                { -1, -1, -1 },
                { 4, 1, 1 },
                { 2, 0.5, 9 },
                { 3.5, 2, -1 },
                { 3, 1.5, 3 },
                { -1.5, 4, 2 },
                { 5.5, 4, -0.5 }
        };
        double[] point1;    
        point1 = new double[3];
        double[] point2;
        point2 = new double[3];
        point1[0] = point1[1] = point1[2] = point2[0] = point2[1] = point2[2] = 0;

        double distance = Double.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
                        points[j][2]) < distance) {
                    distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
                            points[j][2]);
                    point1[0] = points[i][0];
                    point1[1] = points[i][1];
                    point1[2] = points[i][2];
                    point2[0] = points[j][0];
                    point2[1] = points[j][1];
                    point2[2] = points[j][2];
                }
            }
        }

        System.out.println(
                "The closest two points are " + "(" + point1[0] + ", " + point1[1] + ", " + point1[2] + ") and "
                        + "(" + point2[0] + ", " + point2[1] + ", " + point2[2] + ")");
        System.out.println("The distance between the two points is " + distance);
    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }
}
