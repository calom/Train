package OOP2.PolymorphismChallenge;

/**
 * Created by MichalK on 2/2/2016.
 */
class NissanGTR extends Car {

    private int currentSpeed;

    @Override
    public String brake() {
        return "GTR -> brake()";
    }

    @Override
    public String accelerate(int speed) {
        currentSpeed = speed+ currentSpeed;
        return "GTR has accelerated and now driving at " + currentSpeed + " km/h.";
    }


    @Override
    public String startEngine() {
        return "GTR -> start engine()";
    }

    public NissanGTR(int cylinders, String name) {
        super(cylinders, name);
        this.currentSpeed=0;


    }
}

/**
 * Created by MichalK on 2/2/2016.
 */
class Ford extends Car {

    @Override
    public String brake() {
        return "Ford -> brake()";
    }

    @Override
    public String accelerate(int speed) {
        return "Ford has accelerated and now driving at " + getSpeed() + " km/h.";
    }


    @Override
    public String startEngine() {
        return "Ford -> start engine()";
    }

    public Ford(int cylinders, String name) {
        super(cylinders, name);


    }
}

/**
 * Created by MichalK on 2/2/2016.
 */
class Opel extends Car {

    @Override
    public String brake() {
        return "Opel -> brake()";
    }

    @Override
    public String accelerate(int speed) {
        return "Opel has accelerated and now driving at " + getSpeed() + " km/h.";
    }


    @Override
    public String startEngine() {
        return "Opel -> start engine()";
    }

    public Opel(int cylinders, String name) {
        super(cylinders, name);


    }
}


public class Car {

    private int wheels;
    private int cylinders;
    private boolean engine;
    private String name;

    private int speed;


    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
        this.name = name;
        this.speed=0;

    }

    public String startEngine() {
        return "Car -> start engine()";
    }

    public String brake() {

        return getClass().getSimpleName() + " -> brake()"; // or even better and more generic to return is: return getClass().getSimpleName()
    }

    public String accelerate(int speed) {
        this.speed = this.speed + speed;
        return "Car has accelerated and now driving at " + this.speed + " km/h.";
    }

    public int getSpeed() {
        return speed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


}
