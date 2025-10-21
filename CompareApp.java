import java.util.*;
public class CompareApp {
    public static void main(String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.println("Enter first number: ");
        number1 = sc.nextInt();

        // Ask the user to enter the second number
        System.out.println("Enter second number: ");
        number2 = sc.nextInt();

        // Compare the two numbers
        if (number1 == number2) {
            // If the numbers are equal, print a message
            System.out.println("Numbers are equal");
        } else {
            // If the numbers are not equal, print a message
            System.out.println("Numbers are not equal");
        }

    }
}
