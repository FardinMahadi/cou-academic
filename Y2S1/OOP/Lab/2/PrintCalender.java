import java.util.Scanner;

public class PrintCalender {

    /**
     * Prints calendar for a specific month and year
     * 
     * @param month Month (1-12)
     * @param year  Year (e.g., 2024)
     */
    public static void printMonth(int month, int year) {
        // Print the header
        printMonthHeader(month, year);
        printMonthBody(month, year);
    }

    /**
     * Prints calendar for the entire year
     * 
     * @param year Year to print
     */
    public static void printYear(int year) {
        System.out.println("\n" + " ".repeat(20) + year);
        System.out.println("=".repeat(60));

        for (int month = 1; month <= 12; month++) {
            printMonth(month, year);
            System.out.println();
        }
    }

    /**
     * Prints the header of the calendar (month name and year)
     * 
     * @param month Month number (1-12)
     * @param year  Year
     */
    public static void printMonthHeader(int month, int year) {
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("-".repeat(30));
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    /**
     * Prints the body of the calendar with dates
     * 
     * @param month Month number (1-12)
     * @param year  Year
     */
    public static void printMonthBody(int month, int year) {
        // Get the starting day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int startDay = getStartDay(month, year);

        // Get number of days in the month
        int numberOfDays = getNumberOfDaysInMonth(month, year);

        // Print spaces for days before the first day of the month
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.printf("%4d", i);

            // Move to next line if it's Saturday
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        // Add a newline if the month doesn't end on Saturday
        if ((numberOfDays + startDay) % 7 != 0) {
            System.out.println();
        }
    }

    /**
     * Gets the name of the month
     * 
     * @param month Month number (1-12)
     * @return Month name as String
     */
    public static String getMonthName(int month) {
        String[] monthNames = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month];
        }
        return "Unknown";
    }

    /**
     * Gets the starting day of the month (0 = Sunday, 1 = Monday, etc.)
     * Uses Zeller's Congruence algorithm
     * 
     * @param month Month (1-12)
     * @param year  Year
     * @return Starting day (0-6)
     */
    public static int getStartDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;
        int j = year / 100;
        int day = 1;

        // Zeller's Congruence
        int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;

        // Convert to 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        return ((h + 5) % 7);
    }

    /**
     * Gets the number of days in a month
     * 
     * @param month Month (1-12)
     * @param year  Year
     * @return Number of days in the month
     */
    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }

        return 0; // Invalid month
    }

    /**
     * Checks if a year is a leap year
     * 
     * @param year Year to check
     * @return true if leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Interactive method to get month and year from user and print calendar
     */
    @SuppressWarnings("resource")
    public static void printMonthInteractive() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2024): ");
        int year = input.nextInt();

        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input!");
            return;
        }

        printMonth(month, year);
    }

    /**
     * Interactive method to get year from user and print full year calendar
     */
    @SuppressWarnings("resource")
    public static void printYearInteractive() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2024): ");
        int year = input.nextInt();

        if (year < 1) {
            System.out.println("Invalid year!");
            return;
        }

        printYear(year);
    }

    /**
     * Main method for testing (can be called from outside)
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Example usage
        // Print current month (example: January 2024)
        printMonth(1, 2024);

        // Or use interactive methods
        // printMonthInteractive();
        // printYearInteractive();
    }
}
