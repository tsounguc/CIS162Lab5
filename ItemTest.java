import java.text.NumberFormat;
/**
 * Write a description of class ItemTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemTest
{
    public static void main(String [] args)    {

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        // instantiating an item
        Item item1 = new Item("Item1", "GVSU t-shirt", 29.99, 100);
        
        // TO DO: print the item1
        System.out.println(item1);
        
        
        // TO DO:  add 3 units to the inventory of item1
        item1.addToInventory(3);
        
    // TO DO: Change the price of item1 to a new value        //(make up the price)
        item1.setPrice(17);
        
        // TO DO: print the price of item1
        System.out.println(fmt.format(item1.getPrice()));
        
        
        // TO DO:  print the entire item1 
        System.out.println(item1);
        
        
        // TO DO:  Create another item with any given values 
        Item item2 = new Item("Item2", " ChrisTN", 100.00, 1200);
        
// TO DO:  invoke some of the methods to change the         //description, code, and inventory
        item2.setPrice(75.00);
        item2.setInventory(7500);
        // TO DO:  print the item created above.
        System.out.println(item2);
    }    

}
