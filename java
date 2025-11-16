import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for first number
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Prompt user for second number
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Calculate sum
            int sum = num1 + num2;

            // Display result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        } catch (Exception e) {
            // Handle invalid input
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close(); // Always close the scanner
        }
    }
}
im learning the crone systax with poll scm
im shedulng the 11:03 time, now it will shedule automatically on 11:03
  
