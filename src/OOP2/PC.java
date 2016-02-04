package OOP2;

/**
 * Created by MichalK on 1/27/2016.
 * Now advantage of this composition structure: We can "inherit" more than one class/object at the time. You would get an error
 * In this way, PC is using 3 different objects, through its variables.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCse, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCse;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp () {
        theCase.pressPowerButton();
        drawLogo();

    }

//    Composition : creating object withing the object

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    // some graphics here of course
    }
}

