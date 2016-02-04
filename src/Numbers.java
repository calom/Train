/**
 * Created by MichalK on 11/30/2015.
 */
public class Numbers {

    public static void main (String[] args) {
        //int hasa width of 32
        int minValue=-2147483648 ;
        int maxValue= 2147483647    ;

        //byte hasa width of 8
        byte myByteValue = 127 ;  //byte fici od -128 <> 127 hodnoty
        byte newByte= (byte) (myByteValue/2);

        //int hasa width of 16
        short myShortValue= -32768;  // 32767 <> -32768 ...zabera polovociu z int

        //long has a width of 64
        long myLongValue=  100L ;

        long veryLong= 2;
        System.out.println();




        // ASSIGNMENT
        byte varOne= 64;
        short varTwo=1000;
        int varThree= 50000;
        long total= 50000 + 10*(varOne +varTwo + varThree);
        System.out.println(total);
    }
}
