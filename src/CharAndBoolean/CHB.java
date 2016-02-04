package CharAndBoolean;

/**
 * Created by MichalK on 12/14/2015.
 */
public class CHB {
    public static void main(String[] args) {
        char myCopyValue = '\u00A9';   //I can put unicode character like '\u0009' or a letter
        char myRegValue = '\u00AE';   //I can put unicode character like '\u0009' or a letter


        boolean myBooleanValue = false;

        System.out.printf("copyright is this " + myCopyValue + " right? And register looks like this " + myRegValue + " right? ");
    }
}
