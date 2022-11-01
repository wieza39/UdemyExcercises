package udemy.carfactory;

public class Car {
    String model;
    String brand;
 //   String[] color = {"czerwony", "czarny", "biały"}; - zadeklarowałem odrazu color. Ma być szablon
    String color;

//    public udemy.carfactory.Car(){
//        this.model = "Ford";
//        this.brand = "Mustang";
//    } - tutaj tez zadeklorwalem juz konstruktor


//konstruktor
    Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

//    public String getColor() {
//       int index = (int) Math.random();
//      return color;
//    } - logika losowania koloru, powinna byc w factory

    public String getColor() {
        return this.color;
    }

    public void printInfo(){
        System.out.println(this.model + this.brand + " ma kolor " + this.color);
    }
}
