package udemy.override;

public class Main {
    public static void main(String[] args) {
        Roadster car1 = new Roadster(50,150);
        Roadster car2 = new Roadster(60,160,90,190);

        System.out.println("car1 TS: " + car1.getTopSpeed());
        System.out.println("car1 AC: " + car1.getAcceleration());
        System.out.println("car2 TS: " + car2.getTopSpeed());
        System.out.println("car2 AC: " + car2.getAcceleration());
        System.out.println("car2 TS: " + car2.getTopSpeed(true));
        System.out.println("car2 AC: " + car2.getAcceleration(true));
    }


}
