//Brent Codiamat
//CITCS 1N-A

import java.util.Scanner;

public class FinalLaboratory1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declarations.
        int[] stockLevel = new int[10];
        double[] prices = new double[10];
        double totalValue = 0;
        double[] productValue = new double[3];
        double averageValue = totalValue / 10, highestValue = productValue[0], lowestValue = productValue[0];

        //user input for stocks and prices.
        for (int i = 0; i < 10; i++){
            System.out.println("Product " + (i + 1) + " - Stock level: ");
            stockLevel[i] = sc.nextInt();


            System.out.print("Product " + (i + 1) + " - Price: ");
            prices[i] = sc.nextDouble();
        }
        
        //Calculate total value of stocks.
        for(int i = 0; i < 3; i++){
            productValue[i] = stockLevel[i] + productValue[i];
            totalValue += productValue[i];
        }
        
        //Calculate average, highest and lowest value.
        for(int i = 1; i < productValue.length; i++){
            if(productValue[i] > highestValue){
                highestValue = productValue[i];
            }
            if(productValue[i] < lowestValue){
                lowestValue = productValue[i];
            }
        }

        //print out total value, averageValue, highestValue and lowestValue.
        System.out.printf("Total Value of Stock: $%.2f%n", totalValue);
        System.out.printf("Average Value per Product: $%.2f%n", averageValue);
        System.out.printf("Highest Product Value: $%.2f%n", highestValue);
        System.out.printf("Lowest Product Value: $%.2f%n", lowestValue);

        //close scanner
        sc.close();
    }
}
