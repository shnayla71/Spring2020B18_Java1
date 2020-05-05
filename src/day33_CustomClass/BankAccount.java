package day33_CustomClass;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("available balance: "+ balance);
    }
    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance -=amount;
    }
    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance +=amount;
    }

}
