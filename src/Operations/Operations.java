package Operations;

/**
 * Created by MichalK on 12/15/2015.
 */
public class Operations {
    //for basic operations like  + ; - ; / ; * ;....
    public static void main(String[] args) {
        int result = 5 + 5;
        System.out.println(result);

        int prevResult = result;

        result = result - 5;
        System.out.println(prevResult + " - 5 is " + result);

        prevResult = result;

        result = prevResult * 5;
        System.out.println(prevResult + " * 5 is " + result);

        prevResult = result;

        result = prevResult / 5;
        System.out.println(prevResult + " / 5 is " + result);

        prevResult = result;

        result = result % 3;
        System.out.println(prevResult + " % 3 is " + result);

        result++;
        System.out.println("Result is now " + result);
        // so ++ will add 1 to present value of operand
        result++;
        System.out.println("Result is now " + result);
        // or adding exact value in simple manner
        result += 5;
        System.out.println("Result is now " + result);

        result *= 5;
        System.out.println("Result is now " + result);

        result -= 5;
        System.out.println("Result is now " + result);

        result /= 5;
        System.out.println("Result is now " + result);

        //if statements now

        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an alien!");
        else
            System.out.println("It is alien!!!! GET OUT!!!!");

        int topScore = 150;

        if (topScore < 100)
            System.out.println("You got top Score, congrats!");


        //&& as "and also" condition
        int secondTopScore = 150;
        if ((topScore > secondTopScore) && (topScore > 100))
            System.out.println("Top score is greater then second one and more then 100");
        ;


        // || is for "or" condition
        if ((topScore > 160) || (secondTopScore <= 160)) System.out.println("One of this is true");


        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");
        //this is to test "=" vs "==" . = serves as equals and it assigns value
        boolean isCar = false;
        if (isCar == false)      //If I leave it as "if (isCar = false)" that would mean that isCar will always have value 'false' . Thats why we have to use == for actual COMPARISON
            System.out.println("This is not supposed to happen");

//        if isCar is true then return true, otherwise return false always. So basically like double condition where we want to have false at least always unless we assign true value
        boolean wasCar = (isCar) ? true : false;


//        LAST ASSIGNMENT

        double firstValue = 20d;
        double secondDouble = 80d;


//       adding up together and mu ltiply
        double total = (firstValue + secondDouble) * 25;

        System.out.println("total multiplied by 25 is " + total);

        //remainder
        double reminder = total % 2300;
        System.out.println("Reminder is " + reminder + " and total is " + total);

        //So if I leave   "double total = firstValue + secondDouble * 25" without brackets, value would be 2020 because * has higher priority then +. If I do
//       " double total = (firstValue + secondDouble) * 25" then value will be 2500 which will give us our result
        if (reminder <= 200) {
            System.out.println("Total was over the limit");
        }


    }


}
