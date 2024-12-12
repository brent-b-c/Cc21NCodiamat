//Brent Codiamat
//final lab 5.1

import javax.swing.JOptionPane;

public class BankingSystem {
    public static void main(final String[] args) { 

            //try catch statement to catch if user 
            try {
                int availableBalance = 500;

                final String[] options = {"withdraw", "Deposit","exit"};//for options
                String input;
                final int choice = JOptionPane.showOptionDialog(null,"What would you like to do? \navailable balance: " + availableBalance,"Bank",0 ,3 ,null,options,options[2]);
                if (availableBalance == 0) {
                    throw new Exception("insufficient Balance");//Exception for insufficient balance
                }

                //switch statement for choices 
                switch (choice) {
                    case 0 -> {//withdraw
                        input = JOptionPane.showInputDialog(null, "Enter Desired amount", "Withdraw",JOptionPane.INFORMATION_MESSAGE);
                        final int draw = Integer.parseInt(input);
                        if(draw > availableBalance){
                            throw new Exception("Insufficient balance. Current balance: " + availableBalance);
                        }   availableBalance -= draw;
                        JOptionPane.showMessageDialog(null, "Current balance: " + availableBalance);
                        availableBalance--;
                    }
                    case 1 -> {//deposit
                        input = JOptionPane.showInputDialog(null, "Enter Desired amount", "Deposit",JOptionPane.INFORMATION_MESSAGE);
                        final int sit = Integer.parseInt(input);
                        availableBalance += sit;
                        JOptionPane.showMessageDialog(null, "Current balance: " + availableBalance);
                        availableBalance++;
                    }
                    case 2 -> {//exit
                        JOptionPane.showMessageDialog(null, "Thank you for using the bank", "Exit", JOptionPane.INFORMATION_MESSAGE);
                        break ;
                    }
                    default -> {
                    }
                }
            //to catch the error if user inputed 
            }catch (final NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input, please input number");
            }catch (final Exception e) {//catch if user did not input anything
                JOptionPane.showMessageDialog(null, e.getMessage());
        }       
    }
}
