package udemy.carfactory;

public class CarFactory {

    public Car buildCar(){
        String colors[] = {"Czerwony", "czarny", "bialy"};
        int index = (int) Math.floor(Math.random() * colors.length);
        String carColor = colors[index];
        return new Car("ford ", "mustang", carColor);
    }
}
