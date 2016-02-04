package OOP1;


/**
 * Created by MichalK on 1/20/2016.
 */
public class Account {


    private String accountNumber;
    private String phoneNumber;
    private String name;
    private String email;
    private double balance;

//    -----------------Constructors

    public Account ( ) {
        this("no account", "no number ", "no Name", "no email", 0.0);
//        Also if we want, we can create default constructor with default parameters using constructor inside a constructor
    }

        public Account (String accountNumber, String phoneNumber, String name, String email, double balance){
            this.accountNumber = accountNumber;
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.email = email;
            this.balance = balance;
             // this is a main constructor....by using this() in others, I am using this proper one in the to user
    //        constructors with some default values and some added by "client"
            System.out.println("New account created: "+ accountNumber+ ", " +phoneNumber+", "+name+ ", "+email+", "+balance+ ".");
        }


    public Account(String phoneNumber, String name, String email) {
        this("12345",phoneNumber,name,email,0.0);   // its eeven easier this way as you can see.
        }

    //---------------------Client actions with account: Deposit and withdrawal
    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Your current balance is " + this.balance + "$.");
    }

    public void withdraw(double withdraw) {

        if ((this.balance - withdraw)>=0) {
            this.balance -= withdraw;
            System.out.println("You have withdraw " + withdraw + "$. Your current balance is " + this.balance + "$.");
        } else {
            System.out.println("Insufficient funds! Only " + balance + "$ available.");
        }
    }
//---------------------SETTERs AND GETTERS , NEXT TIME DO THEM WITH CODE>Generate ... :)
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Your balance have been changed to " + balance + "$.");
    }

    public String getAccountNumber() {
        return this.accountNumber;

    }

    public void setAccountNumber(String accountNumber) {
    //        int accountLength = String.valueOf(accountNumber).length();
        if (accountNumber.length() == 10) {
            this.accountNumber = accountNumber;
            System.out.println("Your account number is " + accountNumber + ".") ;

        } else {
            System.out.println("Your account number should consist of 10 digits. Make sure you have not typed more or less digits and that you are not typing any letters. Please try again.");

        }
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("Phone number for account " + accountNumber + " set to "+phoneNumber);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name for account " + accountNumber + " set to " +name);

    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email for account " + accountNumber + " set to "+email);

    }



}
