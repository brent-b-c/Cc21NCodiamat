//Brent B. Codiamat
//September 21, 2024

import java.util.Scanner;

public class GroceryCalcuIfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item 1:");
        int item1 = sc.nextInt();

        System.out.println("Enter quantity:");
        int qty1 = sc.nextInt();

        System.out.println("Enter item 2:");
        int item2  = sc.nextInt();

        System.out.println("Enter quantity:");
        int qty2 = sc.nextInt();

        System.out.println("Enter item 3:");
        int item3 = sc.nextInt();
        
        System.out.println("Enter quantity:");
        int qty3 = sc.nextInt();
        int totalAmount = (item1 * qty1) + (item2 * qty2) + (item3 * qty3);

        double discountAmount = 0;
        double discountPercentage = 0;
        double finalPrice = totalAmount;


        if (totalAmount < 1000) {
            discountPercentage = 0; 
        } else if (totalAmount >= 1000 && totalAmount <= 5000) {
            discountPercentage = 5; 
        } else if (totalAmount > 5000 && totalAmount <= 10000) {
            discountPercentage = 10; 
        } else {
            discountPercentage = 15; 
        }

        discountAmount = (totalAmount * discountPercentage) / 100;
        finalPrice = totalAmount - discountAmount;
        
        System.out.println("Total amount of purchased: PHP" + totalAmount);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Final price with discount: PHP" + finalPrice);

        
    }
}