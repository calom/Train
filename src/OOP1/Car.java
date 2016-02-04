package OOP1;

/**
 * Created by MichalK on 1/19/2016.
 */
public class Car {
//    public mean unrestricted access to this class
//    private : no other class can access this particular class ...
//    protected: only classes from this package can access  ...

    private int doors;
    private int wheels;
    private String model; // if I change it to public instead of private, this one is accessible now in Classes as well for Car() objects.
    private String engine;
    private String colour;

    //    so its public, to access it from outside of class (but we wont set mode, and other variables of this class to public
//    to not directly access them (later explained), void as this wont return anything, it will just assign particular
//    model value to a new created object (for instance
    public void setModel(String model) {
        //so update variable model (private String model) with content of parameter model, which was
//        passed to us by method
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        } else {
            this.model = ("Unknown");        // thanks to this, if I pass antything else then defined in IF statement
//            I will get Unknown as I defined it
        }
//now this above is validation, for instance we want only holden and carrera models to be passed to model of our Car object


//        This WHOLE is principle of ENCAPSULATION, meaning not accessing, or allowing to access field model directly,
//        but through methods, particurarly setters and getters.

    }

    public String getModel() {
        return this.model;
    }

}
