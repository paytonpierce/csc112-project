import java.util.ArrayList;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        double subtotal = 0;
        double salesTax = 0;
        double total = 0;

        System.out.println("Welcome to Payton's shop!\n===========Items:====================");
        System.out.println("1. Milk: $5 \t 6. Ham: $3");
        System.out.println("2. Soup: $2 \t 7. 2-Liter Soda: $4");
        System.out.println("3. Eggs: $8 \t 8. Apples: $3");
        System.out.println("4. Bread: $6 \t 9. Crackers: $3");
        System.out.println("5. Candy: $4 \t10. Cheese: $6");
        System.out.println("=====================================");

        ArrayList<Item> receipt = new ArrayList<Item>(
                Arrays.asList(
                        new Item(5,"Milk"),
                        new Item(2,"Soup"),
                        new Item(8,"Eggs"),
                        new Item(6,"Bread"),
                        new Item(4,"Candy"),
                        new Item(3,"Ham"),
                        new Item(4,"2-Liter Soda"),
                        new Item(3,"Apples"),
                        new Item(3,"Crackers"),
                        new Item(6,"Cheese"))
        );

        for(int i = 0; i < args.length; i++) {
            try{
                subtotal = subtotal + (receipt.get(Integer.parseInt(args[i])-1).getPrice());
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

        System.out.printf("Subtotal: \t$%.2f\n",subtotal);
        System.out.printf("Sales tax: \t$%.2f\n", salesTax);
        System.out.printf("Total: \t\t$%.2f\n", total);
    }
}
