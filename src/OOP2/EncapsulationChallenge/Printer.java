package OOP2.EncapsulationChallenge;

/**
 * Created by MichalK on 1/31/2016.
 */
public class Printer {
    private String name;
    private double tonerLevel = 100.00;
    private int numberOfPages = 0;
    private boolean duplex;

    public Printer(String name, boolean duplex) {
        this.name = name;
        this.duplex = duplex;
    }

    public void fillUpToner(int toner) {
        this.tonerLevel = this.tonerLevel + toner;
        if (this.tonerLevel > 0 && this.tonerLevel <= 100) {
            System.out.println("Current toner level is " + this.tonerLevel + "%.");
        } else if (this.tonerLevel <= 0) {
            System.out.println("Toner is used. Level 0 %");

        } else {
            System.out.println("Toner is full!");
        }
    }

    private double usedToner(double pages) {
        double percentageCoef = 0.01;
        this.tonerLevel = tonerLevel - pages * percentageCoef;
        return this.tonerLevel;
    }
    private void printPages (int pagesToPrint) {
        int pagesPrinted = 0;
        while (pagesToPrint > 0) {
            if (tonerLevel > 0) {
                pagesToPrint--;
                pagesPrinted++;
                System.out.println(pagesPrinted + "th page have been printed.");
                usedToner(1);
            } else {
                System.out.println("Printer run out of toner, please refill." + pagesToPrint + " have not been printed.");
                break;

            }
        }

    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getTonerLevel() {
        return this.tonerLevel;
    }

    public void printPage(int pages) {
        this.numberOfPages = pages;
        int pagesToPrint=pages;
        if (duplex) {
            System.out.println("duplex mode printing in");
            this.numberOfPages /= 2;
        } else {
            System.out.println("normal mode printing in");
        }

//        if (duplex){
//            System.out.println("Duplex mode");
//            printPages(pages/2);
//
//        }
//            else{
//            printPages(pages);
//        }


    }
}
