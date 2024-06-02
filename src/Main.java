
import java.util.Scanner;

public class Main {
    private static Inventory inventory = new Inventory();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    updateQuantity();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Add item");
        System.out.println("2. Remove item");
        System.out.println("3. View all items");
        System.out.println("4. Update item quantity");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addItem() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Item item = new Item(id, name, quantity, price);
        inventory.addItem(item);
        System.out.println("Item added successfully.");
    }

    private static void removeItem() {
        System.out.print("Enter ID of item to remove: ");
        int id = scanner.nextInt();
        inventory.removeItem(id);
        System.out.println("Item removed successfully.");
    }

    private static void viewItems() {
        System.out.println("Inventory items:");
        inventory.viewItems();
    }

    private static void updateQuantity() {
        System.out.print("Enter ID of item to update: ");
        int id = scanner.nextInt();

        System.out.print("Enter new quantity: ");
        int quantity = scanner.nextInt();

        inventory.updateQuantity(id, quantity);
        System.out.println("Item quantity updated successfully.");
    }
}

