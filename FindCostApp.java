
import java.util.*;

public class FindCostApp {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double price, tax;

        // call the displayTitle method
        displayTitle();

        // get user input price and tax
        System.out.print("Enter initial price: ");
        price = kbd.nextDouble();

        System.out.print("Enter tax rate: ");
        tax = kbd.nextDouble();

        // call the calculateFinalPrice method
        price = calculateFinalPrice(price, tax);

        // call the displayPrice method
        displayPrice(price);

    }

    public static void displayTitle() {

        // display the title of the program
        System.out.println("*** Product Price Check ***");
        System.out.println("");

    }

    // method to calculate final price after tax
    public static double calculateFinalPrice(double price, double tax) {

        // calculate and return the final price after tax
        return price * (1 + tax / 100);

    }

    // method to display the final price
    public static void displayPrice(double price) {

        // display the final price after tax
        System.out.println("Cost after tax = " + price);

    }
}
