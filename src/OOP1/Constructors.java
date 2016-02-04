package OOP1;

/**
 * Created by MichalK on 1/20/2016.
 */
public class Constructors {

    public static void main (String [] args) {
// BANK TASK FOR CLASSES

        Account bobAccount = new Account();

        bobAccount.setAccountNumber("5464978564");
        bobAccount.getBalance();
        bobAccount.withdraw(500.0);
        bobAccount.setBalance(15987.0);
        bobAccount.withdraw(15000.0);
        bobAccount.withdraw(987.0);
//
//        bobAccount.setEmail("bob@gmail.com");
//        bobAccount.setName("Bob Bill");
//        bobAccount.setPhoneNumber("420 520 456 658");

//        Account lucyAccount = new Account("1234567890","4564231"," Lucy Lu", "lucylu@gmail.com",1000.0);
//
//        Account myAccount = new Account("555 666 444", "michal", "mihcal@mail.com" );
//        System.out.println(myAccount.getAccountNumber()+ " is a new account number for " + myAccount.getName());

//          VipCustomer bob = new VipCustomer("Bob", 500.0);
//        System.out.println(bob.getCreditLimit()+ " is a credit limit of "+bob.getName());
//
//        VipCustomer marta = new VipCustomer();
//        System.out.println(marta.getName());
//
//        VipCustomer vip = new VipCustomer("Vip",50000.0,"vip@vip.com");
//
    }
}
