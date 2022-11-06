package udemy.collections.arraylist.arrayList;

import java.util.ArrayList;

public class ArrayListOne {

    public void arrayExampleOne() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alex");
        names.add("John");
        names.add("Ann");

        System.out.println(names.get(0));

        names.set(2, "Peter");
        names.add(1, "Carol");
        names.remove(0);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
