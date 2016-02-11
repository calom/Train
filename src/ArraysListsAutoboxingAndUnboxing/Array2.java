package ArraysListsAutoboxingAndUnboxing;

import javafx.scene.Scene;
import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * Created by MichalK on 2/11/2016.
 */
public class Array2  {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     int[] myIntegers=getIntegers(5);
        double[] doubleArray=new double[10];
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println(myIntegers[i]+ " bla bla bla number ?  ");

        }


        System.out.println("average of array is "+getAverage(myIntegers));
    }

    public static int[] getIntegers (int number) {
        System.out.println("enter values please");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage (int[] array) {
       double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = (double)  sum + array[i];
        }

        return (double) sum/ (double) array.length;

        }


}
