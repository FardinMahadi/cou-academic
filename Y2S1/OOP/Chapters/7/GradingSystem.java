/**
 * GradingSystem.java
 * 
 * Case study: Grading multiple-choice tests using 2D arrays.
 * 
 * Key Concepts:
 * - 2D array for student answers
 * - Comparing with answer key
 * - Calculating scores
 */
public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("=== Multiple-Choice Test Grading ===");
        System.out.println();
        
        // Students' answers
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        
        // Answer key
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        
        System.out.println("Answer Key:");
        for (int i = 0; i < keys.length; i++) {
            System.out.print("Q" + (i + 1) + ": " + keys[i] + "  ");
        }
        System.out.println();
        System.out.println();
        
        // Grade each student
        System.out.println("Student Results:");
        System.out.println("---------------");
        for (int student = 0; student < answers.length; student++) {
            int correctCount = gradeStudent(answers[student], keys);
            System.out.printf("Student %d: %d correct out of %d (%.1f%%)\n",
                            student, correctCount, keys.length,
                            (correctCount * 100.0 / keys.length));
        }
        System.out.println();
        
        // Question statistics
        System.out.println("Question Statistics:");
        System.out.println("------------------");
        for (int question = 0; question < keys.length; question++) {
            int correctCount = 0;
            for (int student = 0; student < answers.length; student++) {
                if (answers[student][question] == keys[question]) {
                    correctCount++;
                }
            }
            double percentage = (correctCount * 100.0) / answers.length;
            System.out.printf("Question %d: %d/%d correct (%.1f%%)\n",
                            question + 1, correctCount, answers.length, percentage);
        }
    }
    
    /**
     * Grades a student's answers
     * @param studentAnswers Student's answers
     * @param keys Answer key
     * @return Number of correct answers
     */
    public static int gradeStudent(char[] studentAnswers, char[] keys) {
        int correctCount = 0;
        for (int i = 0; i < studentAnswers.length; i++) {
            if (studentAnswers[i] == keys[i]) {
                correctCount++;
            }
        }
        return correctCount;
    }
}

