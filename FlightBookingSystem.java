//Brent Codiamat
//final lab 5.1

import javax.swing.JOptionPane;

public class FlightBookingSystem {
    public static void main(final String[] args) { 

            //try catch statement to catch if user 
            try {
                int availableSeats = 10;

                final String[] options = {"Book", "Cancel Booking","Exit"};//for options
                String input;
                final int choice = JOptionPane.showOptionDialog(null,"What would you like to do? \navailable seats: " + availableSeats,"BRENT's Airline",0 ,3 ,null,options,options[2]);
                if (availableSeats == 0) {
                    throw new Exception("No more seats available");//Exception for NoSeatsAvailableException
                }

                //switch statement for choices 
                switch (choice) {
                    case 0 -> {//booking
                        input = JOptionPane.showInputDialog(null, "Enter how many seats would you like to book", "Withdraw",JOptionPane.INFORMATION_MESSAGE);
                        final int draw = Integer.parseInt(input);
                        if(draw > availableSeats){
                            throw new Exception("Insufficient balance. Current balance: " + availableSeats);
                        }   availableSeats -= draw;
                        JOptionPane.showMessageDialog(null, "Current balance: " + availableSeats);
                        availableSeats--;
                    }
                    case 1 -> {//Cancel booking
                        input = JOptionPane.showInputDialog(null, "Enter how many seats would you like to cancel", "Cancel Booking",JOptionPane.INFORMATION_MESSAGE);
                        final int sit = Integer.parseInt(input);
                        availableSeats += sit;
                        JOptionPane.showMessageDialog(null, "Current available seats: " + availableSeats);
                        availableSeats++;
                    }
                    case 2 -> {//exit
                        JOptionPane.showMessageDialog(null, "Thank you for booking with us", "Exit", JOptionPane.INFORMATION_MESSAGE);
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
