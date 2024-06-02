import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    public void viewItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void updateQuantity(int id, int newQuantity) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setQuantity(newQuantity);
                break;
            }
        }
    }
}
