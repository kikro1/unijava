import java.util.*;

public class Practice {
    public static void main(String[] args) {
        double initialPrice, tax, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Product check");
        System.out.println("initial price: ");
        initialPrice = sc.nextDouble();
        System.out.println("Enter tax rate: ");
        tax = sc.nextDouble();
        total = initialPrice * (1 + tax/100);
        System.out.println("Total:" + total);
        if (total > 100) {
            // System.out.println("Discount applied: 50%");
            System.out.println("Discount applied: " + (tax = tax / 2) + "%");
            
        } else {
            System.out.println("No discount applied");
        }
        System.out.println("FINISH");
    }
    
}