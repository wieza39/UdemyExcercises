package udemy.polymorphism;

public class Main {
    public static void main(String[] args) {
        Flat homes[] = new Flat[9];

        for (int i = 0; i < homes.length; i++) {
            int random = getRandom();
            if(random == 0) {
                homes[i] = new Flat("Wroclaw","Short");
            } else if (random == 1) {
                homes[i] = new House("Poznan", "Medium",500.0f);
            } else if (random == 2) {
                homes[i] = new Residence("Warsaw", "Long", 250.5f, 20.0f);
            }
        }

        for (int i = 0; i < homes.length; i++) {
            if(homes[i] instanceof Residence) {
                Residence residence = (Residence) homes[i];
                System.out.println("\n>>>Residence instance");
                System.out.println("Garage size: " + residence.getGarageSize() + "m2");
                System.out.println(residence.toString());
            } else if(homes[i] instanceof House) {
                House house = (House) homes[i];
                System.out.println("\n>>>House instance");
                System.out.println("Parcel size: " + house.getParcelSize() + "m2");
                System.out.println(house.toString());
            } else if(homes[i] instanceof Flat) {
                Flat flat = homes[i];
                System.out.println("\n>>>Flat instance");
                System.out.println(flat.toString());
            }
        }
    }

    public static int getRandom() {
        double rand = Math.random() * 3;
        return (int) rand;
    }
}
