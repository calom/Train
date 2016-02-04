import java.io.Console;
import java.util.Scanner;

/**
 * Created by MichalK on 11/22/2015.
 */
public class Hello
{
        public static void main (String[] args) {

        // Scanner reader = new Scanner(System.in);

        String name =  new Scanner(System.in).next();
        int i = new Scanner(System.in).nextInt();
        System.out.println("Hello "+ name +"!!!!!!!! You have entered: " +i);
    }

}
