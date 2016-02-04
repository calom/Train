package OOP1.InheritanceChallenge;

/**
 * Created by MichalK on 1/25/2016.
 */
public class Outlander extends CarChallange {

    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 5, 4, false, 6);
        this.roadServiceMonths = roadServiceMonths;
    }
     //because automatic gearbox :)     and to note ...this could be individual class AutomaticGearbox or Accelerate for all cars with automatic gearboxes, or even all vehicles, but
//    also bringing then into question how to make gears in generic in general, because not same gears are applied to vehicles of course

     public void accelerate (int rate) {

         int newVelocity = getCurrentVelocity() + rate ;
         if (newVelocity ==0 )  {
             stop();
             changeGear(1);
         }  else if (newVelocity >0 && newVelocity <=10) {
             changeGear(1);
         }  else if (newVelocity >10 && newVelocity <=20) {
             changeGear(2);
         }  else if (newVelocity >20 && newVelocity <=30) {
             changeGear(3);
         }  else if (newVelocity >40 && newVelocity <=50) {
             changeGear(4);
         }  else if (newVelocity >50 && newVelocity <=60) {
             changeGear(5);
         }                 else if (newVelocity >60 ) {
             changeGear(6);
         }

         if (newVelocity >0) {
             changeVelocity(newVelocity, getCurrentDirection());
         }

     }
}

