package udemy.collections.hashSet.two;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Tom");
        names.add("John");
        names.add("Alex");
        names.add("Tom");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String nameList = iterator.next();
            System.out.println(nameList);
        }

        HashSet<Animal> animals = new HashSet<>();
        Animal dog = new Animal("Dog");
        animals.add(dog);
        animals.add(dog);
        Animal cat = new Animal("Cat");
        animals.add(cat);
        animals.add(cat);
        Animal mouse = new Animal("Mouse");
        animals.add(mouse);
        animals.add(mouse);

        Iterator<Animal> iterator1 = animals.iterator();
        while(iterator1.hasNext()){
            Animal animalList = iterator1.next();
            System.out.println(animalList);
        }


    }
}
