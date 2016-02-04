package OOP1.InheritanceChallenge;

/**
 * Created by MichalK on 1/19/2016.
 */
public class CarChallange extends Vehicle {
//    public mean unrestricted access to this class
//    private : no other class can access this particular class ...
//    protected: only classes from this package can access  ...

    private int doors;
    private int wheels;
    private boolean isManual;
    private int gear;

    private int currentGear;

    public CarChallange(String name, String size, int doors, int wheels, boolean isManual, int gear) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.isManual = isManual;
        this.gear = gear;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): change gear to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("CarChallange.changeVelocit(): Velocity: " + speed +  "km/h, Direction: " + direction);
        move(speed, direction);



    }


}
