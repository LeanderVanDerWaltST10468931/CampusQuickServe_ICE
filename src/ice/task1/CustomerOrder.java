package ice.task1;

/**
 * @author leand
 */
public class CustomerOrder 
{
    private String name;
    private String studentNumber;
    private String itemOrdered;
    private int qauntity;
    private float price;
    
    final double VAT = 1.15;
    
    public CustomerOrder(String name, String studentNumber, String itemOrdered, int quantity, float price)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.itemOrdered = itemOrdered;
        this.qauntity = quantity;
        this.price = price;
    }
    
    
    
}
