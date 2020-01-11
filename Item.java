import java.text.NumberFormat;
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String itemCode, description;
    private int inventory;
    private double price;

    public Item() 
    {
        price = 0.0;
        inventory = 0;
    }

    public Item(String pItemCode, String pDescription, double pPrice, int pInventory) 
    {

        price = pPrice;
        description = pDescription;

        itemCode = pItemCode;
        inventory = pInventory;

    }

    public String getItemCode()
    {
        return itemCode;
    }

    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return price;
    }

    public int getInventory()
    {
        return inventory;
    }

    public void setItemCode(String pItemCode)
    {
        itemCode = pItemCode ;

    }

    public void setDescription(String pDescription)
    {
        description = pDescription;
    }

    public void setPrice(double pPrice)
    {
        if (pPrice >= 0)
        {
            price = pPrice;
        }
    }

    public void setInventory( int pInventory)
    {
        if (pInventory >= 0)
        {
            inventory = pInventory;
        }
    }

    public void addToInventory (int units)
    {
        if(units >= 0)
        {
            inventory += units;
        }
    }

    public void subtractFromInventrory(int units)
    {
        if(units >= 0 && units <=inventory)
        inventory -= units;
    }

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return itemCode + " " + description + " " + fmt.format(price);

    }
}
