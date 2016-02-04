package ControlFlowStatement;

/**
 * Created by MichalK on 1/6/2016.
 */
public class For {

    public static void main (String[] args)   {
//   1st TASK for printing out interest rates for range of rates
     for (double i=8 ; i >=2; i--) {
         System.out.println("At interest rate of " + i + "% you'll get " + calculateInterestRate(10000.0, i));
     }

        System.out.println(Math.sqrt(20.0));
//  2nd task of printing out prime number if it is in range of 2 whole numbers
    int count = 0;
    for (int i = 10; i <=20; i++) {
        if (isPrime(i)) {
            System.out.println("Prime number found and is " + i);
            count++;
        }
        if (count == 3) {
            System.out.println("Exiting, first 3 primes found in your range ...");
            break;
        }

    }
    }


    public static double calculateInterestRate (double amount, double interestRate) {
        return (amount * (interestRate / 100.0)) ;

    }

    public static boolean isPrime (int n) {
        if (n==1) {
            return false;
        }

        for (int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println( n%i);
                return false;
            }

        }
        return true;
    }


}
