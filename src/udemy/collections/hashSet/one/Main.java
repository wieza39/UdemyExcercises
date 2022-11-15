package udemy.collections.hashSet.one;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Car> carSet = new HashSet<>();
        Car car = new Car("Suzuki");

        carSet.add(car);
        carSet.add(car);
        carSet.add(new Car("Ford"));
        carSet.add(new Car("Suzuki"));

        Iterator<Car> carIterator = carSet.iterator();
        while(carIterator.hasNext()){
            Car carSetElement = carIterator.next();
            System.out.println(carSetElement);
        }

    }
}
