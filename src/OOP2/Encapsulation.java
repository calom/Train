package OOP2;

/**
 * Created by MichalK on 1/28/2016.
 */
public class Encapsulation {

    public static void main (String[] args) {

//        Player player = new Player();
//
//        player.health = 100;
//        player.fullName = "Tim" ;
//        player.weapon = "Axe";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health " +player.healthRemaining());
//        damage = 99;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health " +player.healthRemaining());

            EnhancedPlayer player = new EnhancedPlayer("Tim Burton",190,"Axe");
        System.out.println(player.getHealth() + " hp is your current life maggot");
        player.loseHealth(11);
        System.out.println(player.getHealth() + " hp is your current life maggot");
        player.loseHealth(11);
        player.loseHealth(55);
        System.out.println(player.getHealth() + " hp is your current life maggot");
        player.loseHealth(36);
        System.out.println(player.getHealth() + " hp is your current life maggot");



    }
}
