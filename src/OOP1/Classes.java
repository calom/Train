package OOP1;

/**
 * Created by MichalK on 1/19/2016.
 Basic note about objects: They have STATE and BEHAVIOR */

//Class then serves as blueprint or template for object and its creation in Java
public class Classes {
    public static void main (String[] args) {

        Car porsche = new Car(); //this is called initialization    ;  object of type Car, and its porsche
        Car holden = new Car();
        porsche.setModel("Opel");

        System.out.println("Model is " + porsche.getModel());



    }
}
