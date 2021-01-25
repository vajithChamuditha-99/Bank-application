public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailId;

    public VipCustomer(){
        this("name", 5000.00 , "Defaultmail");
    }
    public VipCustomer(String name, double creditLimit) {
        this(name , creditLimit , "email");
    }

    public VipCustomer(String name, double creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
