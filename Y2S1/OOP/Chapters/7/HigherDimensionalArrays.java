/**
 * HigherDimensionalArrays.java
 * 
 * Demonstrates 3D and higher-dimensional arrays.
 */
public class HigherDimensionalArrays {
    public static void main(String[] args) {
        // 1. A 3D array: 3-layered 4x2 matrix
        int[][][] scores = new int[3][4][2];
        
        // Initialize scores
        for (int layer = 0; layer < scores.length; layer++) {
            for (int row = 0; row < scores[layer].length; row++) {
                for (int col = 0; col < scores[layer][row].length; col++) {
                    scores[layer][row][col] = (int)(Math.random() * 100);
                }
            }
        }
        
        // Display 3D array
        System.out.println("3D Array (Scores):");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < scores[i].length; j++) {
                for (int k = 0; k < scores[i][j].length; k++) {
                    System.out.print(scores[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
