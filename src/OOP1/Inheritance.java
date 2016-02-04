package OOP1;

/**
 * Created by MichalK on 1/21/2016.
 */
public class Inheritance {

    public static void main (String [] args) {
        System.out.println((1/2)*(10*2*2));
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Fany",8,14,2,4,1,20,"Long and furry" );
//        dog.eat();
//        dog.run();
        dog.walk();



    }


}
