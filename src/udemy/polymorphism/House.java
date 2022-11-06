package udemy.polymorphism;

public class House extends Flat{
    protected float parcelSize;
    public House(String city, String street, float parcelSize){
        super(city, street);
        this.setParcelSize(parcelSize);
 //       this.parcelSize = parcelSize;
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", parcelSize=" + parcelSize +
                '}';
    }
}
