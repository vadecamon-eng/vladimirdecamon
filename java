import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionActivities {

    public static void main(String[] args) {

        // ==============================
        // Activity 1: Identify Exceptions
        // ==============================

        // Problem A — Division
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Problem A: Cannot divide by zero.");
        }

        // Problem B — Null Reference
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Problem B: Cannot use length() on a null string.");
        }

        // Problem C — Array Index
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem C: Array index is out of bounds.");
        }

        // Problem D — Invalid Number
        try {
            String input = "abc";
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Problem D: Invalid number format.");
        }

        // Problem E — Missing File
        try {
            FileReader reader = new FileReader("records.txt");
            System.out.println("Problem E: File opened successfully.");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem E: File was not found.");
        } catch (Exception e) {
            System.out.println("Problem E: An error occurred while accessing the file.");
        }

        // ==============================
        // Activity 2: Repair the Program
        // ==============================

        int numerator = 100;

        // Test with 5, 2, and 0
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Division attempt completed.");
        }
    }
}
