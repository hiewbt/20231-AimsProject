package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class CalculateNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        
        strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ","Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ","Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        JOptionPane.showMessageDialog(null, strNotification,
                    "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The sum of the two numbers is: " + sum
                    + "\nThe difference of the two numbers is: " + difference
                    + "\nThe product of the two numbers is: " + product
                    + "\nThe quotient of the two numbers is: " + quotient);
        
        System.exit(0);
    }
}