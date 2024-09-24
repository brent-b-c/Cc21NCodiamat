//Brent B. Codiamat
//Fourth Laboratory Exercise
//September 21, 2024

import java.util.Scanner;

public class GroceryCalcuIfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int item1, item2,item3, qty1, qty2, qty3;
        System.out.println("Enter item 1:");
        item1 = sc.nextInt();
        System.out.println("Enter quantity:");
        qty1 = sc.nextInt();
        System.out.println("Enter item 2:");
        item2  = sc.nextInt();
        System.out.println("Enter quantity:");
        qty2 = sc.nextInt();
        System.out.println("Enter item 3:");
        item3 = sc.nextInt();
        System.out.println("Enter quantity:");
        qty3 = sc.nextInt();
        
        int totalAmount = (item1 * qty1) + (item2 * qty2) + (item3 * qty3);
        double discountAmount = 0, discountPercentage = 0, finalPrice = totalAmount;    //this will get the number of discount in the if else

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
