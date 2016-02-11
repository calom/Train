package ArraysListsAutoboxingAndUnboxing;

/**
 * Created by MichalK on 2/4/2016.
 */
public class Array {

    public static void main(String[] args) {
        int[] myArray = new int[58]; //{0,1,2,3,4,5,6,7,8,9};
        double[] myDoubleArray = new double[11];
//        System.out.println(myArray[0]);

        myArray[0] = 15;
        System.out.println(myArray[0]);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 10;
        }

        printArray(myArray);

//        for (int i=0; i< myArray.length;i++){
//            System.out.println(myArray[i] + " here ");
//        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("number " + i + " belongs to " + array[i] + " here ");
        }

    }

}
