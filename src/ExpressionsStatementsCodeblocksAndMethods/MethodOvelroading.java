package ExpressionsStatementsCodeblocksAndMethods;

/**
 * Created by MichalK on 12/29/2015.
 */
public class MethodOvelroading {
    public static void main(String args[]) {

        calcFeeAndInchesToCentimeters(5.0, 0);
        calcFeeAndInchesToCentimeters(59);

    }
//  1 inch = 2.54cm ; 1 foot = 12 inches

    public static double calcFeeAndInchesToCentimeters(double feet, double inches) {

        double centimeters = 2.54 * (inches + (feet * 12));
        System.out.println("Centimeters total is " + centimeters + " cm.");

        if (feet >= 0 || (inches >= 0 && inches <= 12)) {
            return centimeters;
        }
        return -1;
    }

    public static double calcFeeAndInchesToCentimeters(double inches) {
        double feet = (int)(inches / 12.0);
        //so putting there (int) will make remainingInches useful and not equal 0 all the time, because feet will equal ony to integer value without remaining  decimals
        //and thats solely for the purpose of showing how overload works

        double remainingInches = inches - (feet*12);
        calcFeeAndInchesToCentimeters(feet, remainingInches);
        System.out.println(feet+ " feets and remaining inches are " + remainingInches);

        if (inches >= 0) {
            return 1;
        }
        return -1;
    }


}
