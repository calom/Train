package ControlFlowStatement;

/**
 * Created by MichalK on 1/17/2016.
 */
public class DoWhile {

    public static void main(String[] args) {

//        int firstNumber = 5;
//        int finsihNumber = 40;
//        while (firstNumber <= finsihNumber) {
//            if (!isEvenNumber(firstNumber)) {
//                firstNumber++;
//                continue;
//            }
//            System.out.println(firstNumber + " is even number");
//            firstNumber++;
//
//        }

        int number = 10;
        int count = 0;
        while (number <= 30) {
            if (!isEvenNumber(number)) {
//                System.out.println(number + " IS not an even number");
                number++;
                continue;

            }

            System.out.println(number + " IS an even number");
            number++;
            count++;
            if (count>=3) {
                System.out.printf("Count of even number is 3, exiting ... ");
                break;
            }

        }
    }



    // after executed this if condition, and doing number ++ continue jumps back to while loop not executing
    // anything after if condition, when it was true. meaning, if I was on 30 and had continue commented out
    // it would print out sout statement, do count++ whic would be equals 31 and still continued to sout out
//                that 31 is not an even number, after which woul go back to begining of while loop and end with 31<=30
//                being false.
//                Thats the reason to use CONTINUE!!!! it will prevent to execute anything after which should be executed.
//                  That is the case if I would do above while loop vice versa , that if would check for even number and
//                  else would look for not even number     like this:
//                    ------------------------------
//                int number = 21;
//
//                while (number <= 40) {
//                    if (isEvenNumber(number)) {
//                        System.out.println(number + " IS an even number");
//                        number++;
//continue;
//                    }
//                    System.out.println(number + " IS NOT an even number");
//                    number++;
//                    -------------------------------


    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}



