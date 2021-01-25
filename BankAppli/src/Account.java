public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNo;

    public Account(String accountNumber , String customerName , String email , String phoneNo , double balance){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.email=email;
        this.phoneNo=phoneNo;
        this.balance=balance;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Successfully deposited! the balance is "+this.balance);
    }

    public void withdrawl(double withdrawlAmount){
        if (this.balance > withdrawlAmount){
            this.balance-=withdrawlAmount;
            System.out.println("Successfully withdrawed! the balance is "+ this.balance);
        }else{
            System.out.println("You dont have sufficient amount to withdraw.only "+ this.balance+ " available" );
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}