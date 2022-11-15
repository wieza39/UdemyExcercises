package udemy.collections.treeSet;

import javax.swing.text.html.HTMLDocument;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>() {};
            numbers.add(5);
            numbers.add(22);
            numbers.add(15);
            numbers.add(1);
            numbers.add(8);

        System.out.println("Ascending:");
        Iterator<Integer> numberList = numbers.iterator();
        while(numberList.hasNext()){
            System.out.println(numberList.next());
        }

        System.out.println("Descending:");
        Iterator<Integer> numberList1 = numbers.descendingIterator();
        while(numberList1.hasNext()){
            System.out.println(numberList1.next());
        }
    }
}
