//Brent Codiamat
//CITCS 1N-A
//final lab 2
import java.util.Scanner;

public class WeatherDataTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //2d array for storing temperatures
        double[][] temperatures = new double[3][7];
        double[] averageTemperatures = new double[3];
        double[] highestTemperatures = new double[3];

        //ask the user for inputs of temperature each day
        for(int city = 0; city < 3; city++){
            System.out.printf("Enter the temperature for City%d\n ",city + 1);

            for(int day = 0; day < 7; day++){
                System.out.printf("Day %d: ", day + 1);
                temperatures[city][day] = sc.nextDouble();
            }
        }

        //calculate the higesht and average temperature
        for(int city = 0; city < temperatures.length; city++){
            double totalTemperature = 0;
            double highestTemperature = Double.MIN_VALUE;

            for(int day = 0; day < temperatures[city].length; day++){
                totalTemperature += temperatures[city][day];

                if(temperatures[city][day] > highestTemperature){
                    highestTemperature = temperatures[city][day];
                }
            }
            
            //formula of the average and the finder of the higest temp
            averageTemperatures[city] = totalTemperature / temperatures[city].length;
            highestTemperatures[city] = highestTemperature; 
        } 
        for(int city = 0; city < temperatures.length; city++){
            System.out.println();
            for(int day = 0; day < temperatures.length; day++){
                System.out.print(temperatures[city][day]);
                
            }
        }
        //print out details
        System.out.println("\nTemperature Analysis:");
        for (int city = 0; city < temperatures.length; city++) {
            System.out.printf("City %d:\n", city + 1);
            System.out.printf("Average Temperature: %.2f\n", averageTemperatures[city], "C");
            System.out.printf("Highest Temperature: %.2f\n\n", highestTemperatures[city], "C");
        }
        sc.close();
    }
}