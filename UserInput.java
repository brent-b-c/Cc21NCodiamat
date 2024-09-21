//Brent B. Codiamat
//September 7, 2024


import java.util.Scanner;

public class UserInput{
   public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Name: ");
         String name = sc.nextLine();

         System.out.println("Enter your middle name: " + sc);
         char m = sc.next().charAt(0);

         System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter final gpa: ");
        double finalgpa = sc.nextDouble();

        System.out.println("Did you graduate?");
        boolean graduated = sc.hasNextBoolean();


        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your final gpa is: " + finalgpa);
        System.out.println("did you graduate: " + graduated);
        System.out.println("Middle name: " + m);
   }
}