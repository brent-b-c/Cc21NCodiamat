import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("your grade: ");
        int grade = obj.nextInt();

        if(grade >=90 && grade < 100){
            System.out.println("Your grade is A");
        } else if (grade >=80 && grade <= 89){
            System.out.println("your grade is B");
        } else if (grade >=70 && grade <= 79){
            System.out.println("your grade C");
        } else if (grade >=60 && grade <= 69){
            System.out.println("your grade is D ");
        }   else {
            System.out.println("you failed");
        }

        


        
        

    }

}
