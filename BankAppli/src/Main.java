public class Main {
    public static void main(String[] args) {

        Account accountOne=new Account("1001" ,"Alex carter" , "Alexc@gmail.com" , "0774542399" , 0.0);
        System.out.println(accountOne.getAccountNumber());

        VipCustomer vipCustomer=new VipCustomer();
        vipCustomer.setName("Alex");
        System.out.println(vipCustomer.getName());


    }
}
