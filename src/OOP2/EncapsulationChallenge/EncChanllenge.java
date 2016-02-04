package OOP2.EncapsulationChallenge;

/**
 * Created by MichalK on 1/31/2016.
 */
public class EncChanllenge {
    public static void main (String[] args) {
        Printer printer = new Printer("Awesomo",false);

        printer.printPage(2);
        System.out.println(printer.getTonerLevel() +" is toner level, " + printer.getNumberOfPages() + " pages to print");
        printer.printPage(6);
        System.out.println(printer.getTonerLevel() +" is toner level, "+ printer.getNumberOfPages() + " pages to print");




    }
}
