import java.util.Scanner;

class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

public class GroceryShopping {
    public static void main(String[] args) {
        String[] items = {"Apple", "Banana", "Orange", "Pineapple", "Milk", "Egg", "Bread", "Coconut", "Chicken", "Tomato"};
        float[] price = {10.0f, 12.0f, 15.0f, 16.0f, 20.0f, 10.0f, 12.0f, 13.59f, 30.0f, 18.99f};
        Scanner sc = new Scanner(System.in);
        float total = 0.0f;
        
        while (true) { 
            try {
                System.out.println("Enter the name of items (or type 'done' to end the shopping):");
                String Input = sc.nextLine();
                
                if (Input.equalsIgnoreCase("done")) {
                    System.out.println("Your Total Bill is: Rs." + total);
                    System.out.println("Thank you for shopping with us!");
                    break;
                }
                
                int itemindex = -1;
                for (int i = 0; i < items.length; i++) {
                    if (items[i].equalsIgnoreCase(Input)) {
                        itemindex = i;
                    }
                }

                if (itemindex == -1) { 
                    throw new ItemNotFoundException("Item '" + Input + "' not found. Please Try again.");
                }
                
                System.out.println("Enter the Quantity of " + items[itemindex] + ": ");
                int quantity = sc.nextInt();
                sc.nextLine(); 

                float cost = price[itemindex] * quantity;
                total += cost;

                System.out.println("Added " + quantity + " x " + items[itemindex] + " to the bill.");
                System.out.println("Current Total: Rs." + total);

            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid Input. Please Try again.");
                sc.nextLine(); 
            }
            
            System.out.println("Press Enter to continue, or type 'exit' to quit completely.");
            String userIn = sc.nextLine();
            if (userIn.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the shopping cart. Good Bye!");
                break;
            }
        }
      
        sc.close();
    } 
}
