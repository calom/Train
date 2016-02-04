package OOP1.InheritanceChallenge;

/**
 * Created by MichalK on 1/25/2016.
 */
public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0; //its good to have  as we initialized them only. vehicle is not moving at all for now

    }

    public void steer(int direction) {

        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degree");
    }

    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(): Movin at " + this.currentVelocity + "km/h in direction " + this.currentDirection);

    }

    public void stop() {
        this.currentVelocity = 0;
                                }


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
