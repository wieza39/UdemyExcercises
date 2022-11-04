package udemy.IdCounter;

public class Item {
    static int numItems = 0;
    final int ID;

    Item(int id){
        this.ID = id;
    }

    public static int getNextId(){
        return Item.numItems++;
    }

    public static Item getItem() {
        int id = getNextId();
        Item item = new Item(id);
        return item;
    }

    public static void printNumItems() {
        System.out.println("Number of items: " + numItems);
    }

    public void printId() {
        System.out.println("Id: " + ID);
    }
}
