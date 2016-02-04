package OOP2;

/**
 * Created by MichalK on 1/26/2016.
 */
public class Composition {

    public static void main (String[] args) {
        Dimensions dimensions = new Dimensions(20,20,45);
        Case theCase = new Case("220B", "Dell","240", dimensions   );
        Monitor monitor = new Monitor("27inch Beast", "ASUS", 27, new Resolution(2540,1440) );

        MotherBoard motherBoard = new MotherBoard("BJ-3200",    "ASUS", 4, 6, "v2.440");


        PC pc = new PC(theCase,monitor,motherBoard);
//        how to access methods from other classes by composition ? simple: by pc.getMonitor.drawPixels!


        pc.getMotherBoard().loadProgram("Windows 98");
        pc.powerUp();


    }

}
