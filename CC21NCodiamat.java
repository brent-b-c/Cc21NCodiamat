//Brent Codiamat
//Third Laboratory Exerice
//September 12, 2024
import java.util.Scanner;

public class CC21NCodiamat {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); //scanner to make userinput
        
        int item1, item2, item3, qty1, qty2, qty3;
        
        System.out.println("Enter the price of item 1: ");// first item for the user to input
        item1 = sc.nextInt();                       //this will print it out the item1
        System.out.println("Enter the quantity of item 1: ");
        qty1 = sc.nextInt();                        //this wil print out the quantity1
        System.out.println("Enter the price of item 2: ");
        item2 = sc.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        qty2 = sc.nextInt();
        System.out.println("Enter the price of item 3: ");
        item3 = sc.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        qty3 = sc.nextInt();

        int subtotal = (item1 * qty1) + (item2 * qty2) + (item3 * qty3); //formula for subtotal
        double discount = 0.5f; //discount
        double salestax = ((subtotal - discount) * 0.12); //formula for saletax

        
        System.out.println("Subtotal: " + subtotal); //print out subtotal
        System.out.println("Discount: " + subtotal * discount); //print out discount
        System.out.println("Salestax: "+ salestax); //print out salestax
        System.out.println("Final total: " + ((subtotal + salestax) - discount));   //print out final total
    }
}
