package ice.task1;

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
    
}
