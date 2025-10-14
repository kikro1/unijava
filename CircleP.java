import java.util.*;                 // Import the Scanner class from the java.util package for user input
public class CircleP {

    public static void main(String[] args) {

        // Display program title
        System.out.println("**** AREA OF THE CIRCLE ****");
        System.out.println();

        // Create a Scanner object to take input from the user
        Scanner keyboard = new Scanner(System.in);

        // Declare a constant variable for the value of Pi
        final double Py = 3.14;

        // Ask the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Store the user input (radius) in a variable
        double radius = keyboard.nextDouble();

        // Calculate the diameter using the formula: diameter = radius * 2
        final double diameter = radius * 2;
        // Display the diameter
        System.out.println("The diameter of the circle is " + diameter);

        // Calculate the area ()
        double area = Py * (radius * radius);

        // Display the area of the circle
        System.out.println("The area of the circle is " + area);

        // End of program message
        System.out.println();
        System.out.println("**** END OF THE PROGRAM ****");

    }
}
