package OOP2;

/**
 * Created by MichalK on 1/31/2016.
 */
public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints >0 && hitPoints <=100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }



    public void loseHealth (int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
