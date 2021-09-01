import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    //initialized variables
    private String name;
    private int price;

    //constructor
    public Item() {
        price = 0;
        name = "unknown";
    }
    public Item(int myPrice, String myName){
        price = myPrice;
        name = myName;
    }

    //get & set methods
    public void setName(String newName){
        name = newName;
    }
    public void setPrice(int newPrice){
        price = newPrice;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
