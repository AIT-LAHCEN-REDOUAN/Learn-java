package packages;
import  javax.swing.JOptionPane;

public class Input_And_Output_with_swing_package {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first integer: ");
        String input2 = JOptionPane.showInputDialog("Enter the second integer: ");

        try {
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);
            int total = number1 + number2;

            if (total > 500) {
                JOptionPane.showMessageDialog(null, "The Game Ended and the Total is :"+total);
            } else {
                JOptionPane.showMessageDialog(null, "The Game Started and the total is :"+total);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.");
        }
    }
}
