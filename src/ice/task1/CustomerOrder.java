package ice.task1;
import java.text.DecimalFormat;

/**
 * @author leand
 */
public class CustomerOrder 
{
    private String name;
    private String studentNumber;
    private String itemOrdered;
    private int quantity;
    private float price;
    
    
    DecimalFormat format = new DecimalFormat("######.##");
    
    final double VAT = 1.15;
    
    public CustomerOrder(String name, String studentNumber, String itemOrdered, int quantity, float price)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.itemOrdered = itemOrdered;
        this.quantity = quantity;
        this.price = price;
    }
    
    public double CalcTotal()
    {
      return quantity * price * VAT;  
    }
    
    public double CalcSubTotal()
    {
        return quantity * price;
    }
    
    public double CalcVATOnly()
    {
        return CalcTotal() - CalcSubTotal();
    }
    
    public double CalcDiscount()
    {
        return CalcSubTotal() / 90;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getStudentNumber()
    {
        return studentNumber;
    }
    
    public String getitemOrdered()
    {
        return itemOrdered;
    }
    
    public int getquantiy()
    {
        return quantity;
    }
    
    public float getprice()
    {
        return price;
    }
    
    public void displayData()
    {
    
        if (quantity < 3)
        {
        System.out.println("---Campus Quickserve---\n"
                         + "Customer: " + getName() + "\n"
                         + "Student Number: " + getStudentNumber() + "\n\n"
                         + "Item Ordered: " + getitemOrdered() + "\n"
                         + "Quantity: " + getquantiy() + "\n"
                         + "Price: R" + format.format(getprice()) + "\n\n"
                         + "Subototal: R" + format.format(CalcSubTotal()) + "\n"
                         + "VAT(15%): R" + format.format(CalcVATOnly()) + "\n"
                         + "Total: R" + format.format(CalcTotal()));
        }               
        else
        {
        System.out.println("---Campus Quickserve---\n"
                         + "Customer: " + getName() + "\n"
                         + "Student Number: " + getStudentNumber() + "\n\n"
                         + "Item Ordered: " + getitemOrdered() + "\n"
                         + "Quantity: " + getquantiy() + "\n"
                         + "Price: R" + format.format(getprice()) + "\n\n"
                         + "Discount: R" + format.format(CalcDiscount()) + "\n"
                         + "Subototal: R" + format.format(CalcSubTotal()) + "\n"
                         + "VAT(15%): R" + format.format(CalcVATOnly()) + "\n"
                         + "Total: R" + format.format(CalcTotal()));
        }
        
        System.out.println("\nThank you for your order!\n"
                         + "--------------------------");
    }
    
    
    
}
