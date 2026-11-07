
import java.util.Scanner;

public class test47 {

    private static final String[] MENU_ITEMS = { "Samosa", "Veg Puff", "Masala Dosa", "Tea / Coffee", "Cold Drink" };
    private static final int[] MENU_PRICES = { 20, 35, 60, 15, 40 };

    private static String[] cartItems = new String[50];
    private static int[] cartQuantities = new int[50];
    private static int[] cartSubtotals = new int[50];
    private static int cartSize = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n*** WELCOME TO THE CANTEEN ***");
            System.out.println("1. View Menu");
            System.out.println("2. Order Food");
            System.out.println("3. View Cart & Checkout");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        showMenu();
                        break;
                    case 2:
                        addToCart(scanner);
                        break;
                    case 3:
                        generateBill();
                        break;
                    case 4:
                        System.out.println("Exiting Canteen System. Have a great day!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Please choose a valid option (1-4).");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- CANTEEN MENU ---");
        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.println((i + 1) + ". " + MENU_ITEMS[i] + " - ₹" + MENU_PRICES[i]);
        }
    }

    private static void addToCart(Scanner scanner) {
        showMenu();
        System.out.print("\nEnter the item number to order: ");

        if (scanner.hasNextInt()) {
            int itemIndex = scanner.nextInt() - 1;

            if (itemIndex >= 0 && itemIndex < MENU_ITEMS.length) {
                System.out.print("Enter quantity for " + MENU_ITEMS[itemIndex] + ": ");

                if (scanner.hasNextInt()) {
                    int quantity = scanner.nextInt();

                    if (quantity > 0) {
                        cartItems[cartSize] = MENU_ITEMS[itemIndex];
                        cartQuantities[cartSize] = quantity;
                        cartSubtotals[cartSize] = MENU_PRICES[itemIndex] * quantity;
                        cartSize++;

                        System.out.println("Added " + quantity + " x " + MENU_ITEMS[itemIndex] + " to your cart.");
                    } else {
                        System.out.println("Quantity must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid quantity entered.");
                    scanner.next();
                }
            } else {
                System.out.println("Invalid menu item selection.");
            }
        } else {
            System.out.println("Invalid selection input.");
            scanner.next();
        }
    }

    private static void generateBill() {
        if (cartSize == 0) {
            System.out.println("\nYour cart is empty!");
            return;
        }

        System.out.println("\n===============================");
        System.out.println("          YOUR BILL            ");
        System.out.println("===============================");
        int totalAmount = 0;

        for (int i = 0; i < cartSize; i++) {
            System.out.println((i + 1) + ". " + cartItems[i] + " (x" + cartQuantities[i] + ") - ₹" + cartSubtotals[i]);
            totalAmount += cartSubtotals[i];
        }

        System.out.println("-------------------------------");
        System.out.println("Total Amount Due: ₹" + totalAmount);
        System.out.println("===============================\n");

        cartSize = 0;
        System.out.println("Thank you! Your order has been placed successfully.");
    }
}
