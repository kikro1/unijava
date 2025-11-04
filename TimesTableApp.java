//import java.util.Scanner;
import java.util.Scanner;

public class TimesTableApp {
    public static void main(String[] args) {
        //int of the future number to be generated
        int number;
        System.out.println("Start of the program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate its times table: ");

        number = sc.nextInt();
        //check if the number is less than or equal to 100 or greater than 2
        while (number > 100 || number < 2) {
            //if the number is greater than 100 or less than 2,the user to enter a valid number
            System.out.println("Error");
            System.out.println("Number exceeds 100, please enter a number less than 100 or greater than 2.");
            number = sc.nextInt();
        }
        //if the number is valid, generate the times table
        for ( int i = 1; i <= 12; i++){
            //print the times table
                System.out.println( number + " x " + i + " = " + number * i);
            }
            System.out.println("End of the program");
        
        }
}


