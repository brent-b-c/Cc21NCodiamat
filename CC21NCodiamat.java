//Brent Codiamat
//September 12, 2024
import java.util.Scanner;

public class CC21NCodiamat {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the price of item 1: ");
        int item1 = sc.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int qty1 = sc.nextInt();
        System.out.print("Enter the price of item 2: ");
        int item2 = sc.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int qty2 = sc.nextInt();
        System.out.print("Enter the price of item 3: ");
        int item3 = sc.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int qty3 = sc.nextInt();

        int subtotal = (item1 * qty1) + (item2 * qty2) + (item3 * qty3);
        float discount = 0.5f;
        double salestax = ((subtotal - discount) * 0.12);

        
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + subtotal * discount);
        System.out.println("Salestax: "+ salestax);
        System.out.println("Final total: " + ((subtotal + salestax) - discount));
    }
}