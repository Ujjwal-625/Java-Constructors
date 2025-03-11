public class BackAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BackAccount(){
        accountHolder="Random";
        accountNumber=98989872;
        balance=193874.098;
    }

    public void getBalance(){
        System.out.println("Balance = "+balance);
    }
    public void setBalance(double balance){
        System.out.println("setting balance to  "+balance);
        this.balance=balance;
    }

    public static void main(String[] args) {
        SavingAccount ac=new SavingAccount();

        ac.getBalance();

        ac.setBalance(9089329.989);

        ac.getBalance();

        System.out.println("Accessing public and protected members");

        System.out.println(ac.accountNumber);
        System.out.println(ac.accountHolder);
    }
}

class SavingAccount extends BackAccount{

}
