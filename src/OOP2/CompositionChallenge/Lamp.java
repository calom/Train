package OOP2.CompositionChallenge;

/**
 * Created by MichalK on 1/28/2016.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(boolean battery, String style, int globRating) {
        this.battery = battery;
        this.style = style;
        this.globRating = globRating;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    public void turnOn() {
        System.out.println("Lamp.turnOn() - > lamp is turned on");


    }

}
