package ice.task1;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * @author leand
 */
public class ICETask1 
{

    Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        String name ="";
        String studentNumber ="";
        String itemOrdered ="";
        int quantity =0;
        float price =0;
        
        while (true)
        {
            try
        {
            name = JOptionPane.showInputDialog("Please enter your name");
            studentNumber = JOptionPane.showInputDialog("Please enter your Student Number");
            itemOrdered = JOptionPane.showInputDialog("Please enter the name of the item");
            quantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of items"));
            price = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price"));
            break;
        }
        catch(Exception E)
        {
            System.out.println("Please enter a valid input");
        }
        }
        
        
        CustomerOrder order = new CustomerOrder(name, studentNumber, itemOrdered, quantity, price);
        
        
        
        
    }
    
}
