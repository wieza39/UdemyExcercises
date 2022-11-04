package udemy.IdCounter;

public class MainItem {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Item item = Item.getItem();
            item.printId();
        }
        Item.printNumItems();
    }

}
