package OOP1;

/**
 * Created by MichalK on 1/21/2016.
 */
public class VipCustomer {

    private String name;
    private Double creditLimit;
    private String email;

    public VipCustomer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer() {
        this("DefName", 50000.0, "DefEmail");
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
