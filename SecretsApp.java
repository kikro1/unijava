
 //This program will output a different secret based on the security level entered by the user.
 
 import java.util.*;
public class SecretsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Secrets App");
        int securityLevel;

        // Ask the user to enter the level number
        System.out.println("Enter security level (1-3): ");
        securityLevel = sc.nextInt();
        
        // Switch statement to handle different security levels
        switch (securityLevel) {
            case 1: {
                // Output secret for security level 1
                //Line 21, 27, 39 are for readability for the program output
                System.out.println("The security guard is a robot");
                System.out.println("");
                break;
            } 
            case 2: {
                // Output secret for security level 2
                System.out.println("There is a secret room in the basement");
                System.out.println("");
                break;
            }
            case 3: {
                // Output secret for security level 3
                System.err.println("The cook is an alien");
                System.out.println("");
                break;
            }
            default: {
                // Output message for invalid security level
                System.out.println("No secrets for you");
                System.out.println("");
                break;
            }
        }
        System.out.println("End of program");
    }
}

