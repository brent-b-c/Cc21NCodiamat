//BRENT CODIAMAT
//CITCS 1N-A
//Nov 21, 2024
//lab 3
import java.util.Scanner;

public class UniversityCourseEnrollmentAndGradesTracker{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int row = 3, column = 5;
        //1Dimensional array for the student names
        String[] studentName = new String[column];
        //2Dimensional array for the students grades
        double[][] studentGrades = new double[column][row];

        //ask user to input names
        for(int name = 0; name < 5; name++){
            System.out.printf("Enter Student name %d: \n", name + 1);
            studentName[name] = sc.nextLine();  
        }

        //ask user to input grades for each subject
        for(int student = 0; student < 5; student++){
            System.out.printf("Enter grade for Student %d\n", student+ 1);
            
            for(int subject = 0; subject < 3; subject++){
                System.out.printf("Subject %d :", subject + 1);
                studentGrades[student][subject] = sc.nextDouble();
            }
        }

        //for loop of the computation of grades
        System.out.println("\nAverage grades per student:\n ");
        for(int student = 0; student < 5; student++){
            double sum = 0; 

            for(int subject = 0; subject < 3; subject++){
                sum += studentGrades[student][subject];
            }
            //formula for average and print out everything
            double average = sum / row;
            System.out.printf("%s: Average grade: %.2f%n", studentName[student], average);
        }
        sc.close();
    }
}