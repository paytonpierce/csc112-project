import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int subtotal = 0;
        double salesTax = 0;

        System.out.println("Welcome to Payton's shop!\n============Menu:=============");
        System.out.println("1. Milk: $5 \t 6. Ham: $3");
        System.out.println("2. Soup: $2 \t 7. 2-Liter Soda: $4");
        System.out.println("3. Eggs: $8 \t 8. Apples: $3");
        System.out.println("4. Bread: $6 \t 9. Crackers: $3");
        System.out.println("5. Candy: $4 \t10. Cheese: $6");
        System.out.println("==============================");

        ArrayList<String> items = new ArrayList<String>(
                Arrays.asList("Milk","Soup","Eggs", "Bread", "Candy","Ham","2-Liter Soda","Apples","Crackers","Cheese")
        );
        ArrayList<Integer> prices = new ArrayList<Integer>(
                Arrays.asList(5,2,8,6,4,3,4,3,3,6)
        );

        //input: 1 3 5 7

        ArrayList<Integer> request = new ArrayList<Integer>(
                Arrays.asList(1,3,5,7)
        );

        for(int i = 0; i < request.size(); i++) {
            if (request.get(i) < items.size()) {
                subtotal = subtotal + prices.get(i);
            } else {
                break;
            }
        }

        salesTax = subtotal * (0.05);

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Sales tax: " + salesTax);
        System.out.println("Total: " + (subtotal + salesTax));
    }
}
