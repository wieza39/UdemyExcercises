package udemy.collections.hashMap.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Product> priceList= new HashMap<>();
        priceList.put("Cheese", new Product(5));
        priceList.put("Bread", new Product(2));
        priceList.put("Mayo", new Product(8));

        Product p = priceList.get("Cheese");
        System.out.println("Value for key 'Cheese' is -> " + p);

        Iterator i = priceList.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry);
        }
    }
}
