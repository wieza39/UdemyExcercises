package udemy.collections.arraylist.arrayList;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTwo {

    public void arrayExampleTwo(){

        ArrayList<String> names = new ArrayList<>();

        names.add("\nAlex");
        names.add("John");
        names.add("Ann");

        Iterator<String>  iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
