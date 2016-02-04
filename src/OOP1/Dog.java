package OOP1;

/**
 * Created by MichalK on 1/22/2016.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//special constructor which calls the constructor of extended class (for word super, as Animal becomes Super class for Dog which makes sense also by hierarchy),
// and it was easily created by code>generate>constructor automatically...
//some parameteres are obvious (brain,body) and I can "remove" them from the consturctor and add there default value instead 1, meaning present
//and of course eventually adding parameters only present for Dog, so we get nice constructor with inheritance in it...

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called ");

    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called ");
        chew();
        super.eat();
    }

    public void walk () {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run () {
        System.out.println("Dig.run() called");
        move(10);
    }

//    for move method, or other, if I override a method from super class inside other class,whenever I call that method, I am calling the overriden method, unless I use
//    keyword as super.move() - that would mean exactly, that I dont actually want to use overridden method now, but instead I want original from Super class, in this case that would be Animal
//On the other hand, if I never create override method, then method from super is called automatically...so whether it would be just move(), or super.move() result will be the same
//Such overriding is good, so I can distinguish by super which I really want to use so....:

    public void moveLegs (int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

