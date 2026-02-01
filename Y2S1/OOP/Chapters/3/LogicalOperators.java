/**
 * LogicalOperators.java
 * 
 * Demonstrates logical operators in Java: && (AND), || (OR), ! (NOT).
 * 
 * Key Concepts:
 * - AND operator (&&)
 * - OR operator (||)
 * - NOT operator (!)
 * - Truth tables
 * - Short-circuit evaluation
 * - Combining logical operators
 */
public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("=== Logical Operators ===");
        System.out.println();
        
        // 1. AND Operator (&&)
        System.out.println("1. AND Operator (&&):");
        System.out.println("----------------------");
        System.out.println("Returns true only if BOTH operands are true");
        System.out.println();
        
        boolean a = true;
        boolean b = false;
        
        System.out.println("Truth Table for AND (&&):");
        System.out.println("A\tB\tA && B");
        System.out.println("true\ttrue\t" + (true && true));
        System.out.println("true\tfalse\t" + (true && false));
        System.out.println("false\ttrue\t" + (false && true));
        System.out.println("false\tfalse\t" + (false && false));
        System.out.println();
        
        // Practical example
        int age = 20;
        boolean hasLicense = true;
        System.out.println("Age: " + age + ", Has License: " + hasLicense);
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive!");
        }
        System.out.println();
        
        // 2. OR Operator (||)
        System.out.println("2. OR Operator (||):");
        System.out.println("--------------------");
        System.out.println("Returns true if AT LEAST ONE operand is true");
        System.out.println();
        
        System.out.println("Truth Table for OR (||):");
        System.out.println("A\tB\tA || B");
        System.out.println("true\ttrue\t" + (true || true));
        System.out.println("true\tfalse\t" + (true || false));
        System.out.println("false\ttrue\t" + (false || true));
        System.out.println("false\tfalse\t" + (false || false));
        System.out.println();
        
        // Practical example
        char grade = 'B';
        System.out.println("Grade: " + grade);
        if (grade == 'A' || grade == 'B') {
            System.out.println("Good grade!");
        } else {
            System.out.println("Could be better");
        }
        System.out.println();
        
        // 3. NOT Operator (!)
        System.out.println("3. NOT Operator (!):");
        System.out.println("--------------------");
        System.out.println("Reverses the boolean value");
        System.out.println();
        
        System.out.println("Truth Table for NOT (!):");
        System.out.println("A\t!A");
        System.out.println("true\t" + !true);
        System.out.println("false\t" + !false);
        System.out.println();
        
        // Practical example
        boolean isStudent = false;
        System.out.println("Is Student: " + isStudent);
        if (!isStudent) {
            System.out.println("Not a student");
        } else {
            System.out.println("Is a student");
        }
        System.out.println();
        
        // 4. Combining Logical Operators
        System.out.println("4. Combining Logical Operators:");
        System.out.println("--------------------------------");
        int score = 85;
        boolean isPassing = score >= 60;
        boolean isExcellent = score >= 90;
        
        System.out.println("Score: " + score);
        System.out.println("Is Passing: " + isPassing);
        System.out.println("Is Excellent: " + isExcellent);
        System.out.println();
        
        // Complex conditions
        if (score >= 60 && score < 90) {
            System.out.println("You passed but didn't get an A");
        }
        
        if (score >= 90 || score < 60) {
            System.out.println("Either excellent or failed");
        }
        
        if (!(score < 60)) {
            System.out.println("You did not fail (using NOT)");
        }
        System.out.println();
        
        // 5. Real-world Example: Login System
        System.out.println("5. Real-world Example - Login System:");
        System.out.println("--------------------------------------");
        String username = "admin";
        String password = "password123";
        boolean isActive = true;
        
        String inputUsername = "admin";
        String inputPassword = "password123";
        
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: " + inputPassword);
        System.out.println("Account Active: " + isActive);
        System.out.println();
        
        if (username.equals(inputUsername) && 
            password.equals(inputPassword) && 
            isActive) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
            if (!username.equals(inputUsername)) {
                System.out.println("  - Incorrect username");
            }
            if (!password.equals(inputPassword)) {
                System.out.println("  - Incorrect password");
            }
            if (!isActive) {
                System.out.println("  - Account is inactive");
            }
        }
        System.out.println();
        
        // 6. Age and Permission Example
        System.out.println("6. Age and Permission Example:");
        System.out.println("------------------------------");
        int userAge = 25;
        boolean hasParentalConsent = false;
        boolean hasMembership = true;
        
        System.out.println("Age: " + userAge);
        System.out.println("Has Parental Consent: " + hasParentalConsent);
        System.out.println("Has Membership: " + hasMembership);
        System.out.println();
        
        // Can access if: (age >= 18) OR (age >= 13 AND hasParentalConsent) AND hasMembership
        boolean canAccess = ((userAge >= 18) || 
                            (userAge >= 13 && hasParentalConsent)) && 
                            hasMembership;
        
        if (canAccess) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
            if (userAge < 18 && (userAge < 13 || !hasParentalConsent)) {
                System.out.println("  - Age requirement not met");
            }
            if (!hasMembership) {
                System.out.println("  - Membership required");
            }
        }
        System.out.println();
        
        // 7. Short-circuit Evaluation
        System.out.println("7. Short-circuit Evaluation:");
        System.out.println("-----------------------------");
        System.out.println("AND (&&): If first is false, second is NOT evaluated");
        System.out.println("OR (||): If first is true, second is NOT evaluated");
        System.out.println();
        
        int x = 5;
        System.out.println("x = " + x);
        
        // This won't cause division by zero because of short-circuit
        if (x != 0 && (10 / x) > 2) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false or x is zero");
        }
        System.out.println();
        
        // 8. De Morgan's Laws
        System.out.println("8. De Morgan's Laws:");
        System.out.println("---------------------");
        boolean p = true;
        boolean q = false;
        
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("!(p && q) = " + !(p && q));
        System.out.println("!p || !q = " + (!p || !q));
        System.out.println("These are equivalent!");
        System.out.println();
        
        System.out.println("!(p || q) = " + !(p || q));
        System.out.println("!p && !q = " + (!p && !q));
        System.out.println("These are also equivalent!");
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

