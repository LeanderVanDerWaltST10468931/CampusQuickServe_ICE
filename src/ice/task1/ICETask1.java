package ice.task1;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

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
        DecimalFormat format = new DecimalFormat("######.##");
        
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
        
        System.out.println("---Campus Quickserve---\n"
                         + "Customer: " + order.getName() + "\n"
                         + "Student Number: " + order.getStudentNumber() + "\n\n"
                         + "Item Ordered: " + order.getStudentNumber() + "\n"
                         + "Quantity: " + order.getquantiy() + "\n"
                         + "Price: R" + format.format(order.getprice()) + "\n\n"
                         + "Subototal: R" + format.format(order.CalcSubTotal()) + "\n"
                         + "VAT(15%): R" + format.format(order.CalcVATOnly()) + "\n"
                         + "Total: R" + format.format(order.CalcTotal()));
        
        System.out.println("\nThank you for your order!\n"
                         + "--------------------------");
        
        
    }
    
}
