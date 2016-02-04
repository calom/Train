package PrimitiveTypes;

/**
 * Created by MichalK on 12/14/2015.
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
//    byte
//    short
//    int
//    long
//    float
//    double
//    char
//    boolean
//    Primitive datatype already integrated to java; these are 8 basic ones
        //

        String myString = "string bro";
        System.out.println(myString);
        myString = myString+ " and just some more string bro";
        System.out.printf(myString);
        myString = myString + " \u00a9 2015";

        String numberString = "666.666";
        numberString = numberString + 333.333;
        System.out.println(numberString);

        String lastString = "10";
        int myInt= 50;
        lastString=lastString+myInt;
        System.out.println(lastString);
        //So if int is added to String it is converted into a String too and added as characters to previous ones

        double myDouble = 4.27;
        lastString=lastString+myDouble;
        System.out.println("now with double it is = " + lastString);
        //same with double and most likely every numeric variable





    }
}
