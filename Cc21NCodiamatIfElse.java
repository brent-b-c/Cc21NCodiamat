//Brent B. Codiamat
//September 19,2024

import java.util.Scanner;

public class Cc21NCodiamatIfElse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter your Grade (0-100): ");
        int score = scanner.nextInt();
        
       
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is: A");
        } else if (score >= 80 && score < 89) {
            System.out.println("Your grade is: B");
        } else if (score >= 70 && score < 79) {
            System.out.println("Your grade is: C");
        } else if (score >= 60 && score < 69) {
            System.out.println("Your grade is: D");
        } else {
            System.out.println("Your grade is F:");
        }
        scanner.close();
        }

    }
