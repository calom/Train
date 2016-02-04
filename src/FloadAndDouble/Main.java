package com.Michalk;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by MichalK on 12/6/2015.
 */
public class Main    {
    public static void main ( String[] args) {
//        width int is 32
//        int myIntValue= 5/3;
//        //        width float is 32
//        float myFloatValue=  5/3f;
//        //        width double is 64
//        double myDoubleValue= 5/3d ;
//
//
//        System.out.println("myIntValue= "+myIntValue);
//        System.out.println(" myDoubleValue = "+ myDoubleValue );
//        System.out.println( " myFloatValue = " +myFloatValue);


//        Pounds to kg
        double pound = new Scanner(System.in).nextDouble();

        double converter= 0.45359237d;
        double kg = pound*converter ;

        System.out.printf(pound + " pounds weight exactly " +kg+ " kilograms!");



    }
}
