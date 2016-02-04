package OOP2.PolymorphismChallenge;

/**
 * Created by MichalK on 2/2/2016.
 */
public class PolChallenge {
    public static void main (String[] args) {
        Car car = new Car(4,"Alfa Romeo");
        NissanGTR gtr = new NissanGTR(8, "GTR34");
        Opel opel = new Opel(6, "Opel Astra");
        Ford ford = new Ford(12, "Ford Excort");

        System.out.println(car.accelerate(20));
        System.out.println(car.brake());


        System.out.println(gtr.accelerate(33));
        System.out.println(gtr.accelerate(58));
        System.out.println(gtr.brake())

        ;System.out.println(opel.accelerate(50));
        System.out.println(opel.accelerate(50));
        System.out.println(opel.brake());

        System.out.println(ford.accelerate(50));
        System.out.println(ford.accelerate(50));
        System.out.println(ford.brake());

    }
}
