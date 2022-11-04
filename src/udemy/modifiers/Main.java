package udemy.modifiers;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Suziki", "Cross");
        MotorBike motor = new MotorBike("Honda", "CX500");
        bike.printInfo();
        motor.printInfo();
    }
}
