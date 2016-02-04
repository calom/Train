package OOP2.CompositionChallenge;

/**
 * Created by MichalK on 1/28/2016.
 */
public class Challenge {
    public static void main(String[] args) {


        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("south");

        Lamp lamp = new Lamp(true, "Wooden lamp", 75);

        Ceiling ceiling = new Ceiling(300, "Red");

        Bed bed = new Bed("Classic dark wood", 4, 3, 2, 1);

        BedRoom bedroom = new BedRoom("my bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();




    }
}
