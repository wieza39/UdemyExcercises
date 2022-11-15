package udemy.collections.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<Animal> animals = new LinkedList<>();
        String animalList[] = {"Dog", "Cat", "Tiger", "Taurus"};
        for (int i = 0; i < 20; i++){
            String rand = animalList[ (int) Math.floor(Math.random() * animalList.length)];
            animals.add(new Animal(rand));
        }
        animals.removeFirst();
        animals.removeLast();

        animals.addFirst(new Animal(animalList[0]));
        animals.addLast(new Animal(animalList[2]));

        ListIterator<Animal> iterator = animals.listIterator();

        while(iterator.hasNext()){
            Animal animal = iterator.next();
            System.out.println(animal);
        }
    }
}
