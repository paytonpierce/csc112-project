import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int subtotal = 0;
        double salesTax = 0;
        double total = 0;

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

        for(int i = 0; i < args.length; i++) {
            try{
                subtotal = subtotal + prices.get(Integer.parseInt(args[i]));
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Item " + args[i] + " does not exist. please choose a number 1-10. Cancelling order.");
                System.exit(1);
            }
            catch(NumberFormatException n){
                System.out.println("You must input the items in number form. \"" + args[i] + "\" is not an acceptable input. Cancelling order.");
                System.exit(1);
            }
        }

        salesTax = subtotal * (0.05);
        total = subtotal + salesTax;

        System.out.println("Subtotal: \t" + subtotal);
        System.out.printf("Sales tax: \t%.2f\n", salesTax);
        System.out.printf("Total: \t\t%.2f\n", total);
    }
}
