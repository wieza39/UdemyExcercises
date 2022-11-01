package udemy.override;

public class Roadster {

    int topSpeed;
    int crazyTopSpeed;
    int acceleration;
    int crazyAcceleration;
    boolean crazyMode;

    Roadster(int topSpeed, int acceleration){
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster(int topSpeed, int acceleration, int crazyTopSpeed, int crazyAcceleration){
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
        this.crazyMode = true;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getTopSpeed(boolean crazyMode) {
        if(crazyMode) {
            return crazyTopSpeed;
        }
        return topSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getAcceleration(boolean crazyMode) {
        if (crazyMode) {
            return crazyAcceleration;
        }
        return acceleration;
    }

}
