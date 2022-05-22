package personal;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(){
        this("Ife",100.00,"ait@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "jumoke@email.com") ;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
