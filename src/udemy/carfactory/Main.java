package udemy.carfactory;

public class Main {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();

        Car car1 = factory.buildCar();
        Car car2 = factory.buildCar();

        car1.printInfo();
        car2.printInfo();
    }
}
