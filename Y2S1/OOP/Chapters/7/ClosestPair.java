/**
 * ClosestPair.java
 * 
 * Case study: Finding the two closest points in a 2D plane.
 * 
 * Key Concepts:
 * - 2D array for points (x, y coordinates)
 * - Distance calculation
 * - Finding minimum distance
 */
public class ClosestPair {
    public static void main(String[] args) {
        System.out.println("=== Closest Pair Problem ===");
        System.out.println();
        
        // Points as [x, y] coordinates
        double[][] points = {
            {-1, 3}, {-1, -1}, {1, 1}, {2, 0.5},
            {2, -1}, {3, 3}, {4, 2}, {4, -0.5}
        };
        
        System.out.println("Points:");
        for (int i = 0; i < points.length; i++) {
            System.out.printf("Point %d: (%.1f, %.1f)\n", 
                            i, points[i][0], points[i][1]);
        }
        System.out.println();
        
        // Find closest pair
        double minDistance = Double.MAX_VALUE;
        int point1 = 0, point2 = 1;
        
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = calculateDistance(points[i], points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    point1 = i;
                    point2 = j;
                }
            }
        }
        
        System.out.println("Closest Pair:");
        System.out.printf("Point %d: (%.1f, %.1f)\n", 
                        point1, points[point1][0], points[point1][1]);
        System.out.printf("Point %d: (%.1f, %.1f)\n", 
                        point2, points[point2][0], points[point2][1]);
        System.out.printf("Distance: %.4f\n", minDistance);
        System.out.println();
        
        // Show all distances for verification
        System.out.println("All Pair Distances:");
        System.out.println("------------------");
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = calculateDistance(points[i], points[j]);
                System.out.printf("Point %d to Point %d: %.4f\n", i, j, dist);
            }
        }
    }
    
    /**
     * Calculates Euclidean distance between two points
     * @param p1 First point [x, y]
     * @param p2 Second point [x, y]
     * @return Distance between points
     */
    public static double calculateDistance(double[] p1, double[] p2) {
        double dx = p1[0] - p2[0];
        double dy = p1[1] - p2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}

