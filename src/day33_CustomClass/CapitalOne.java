package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Anna=new BankAccount();
        Anna.accountHolder="Anna";
        Anna.accountNumber=123456;


        Anna.checkingBalance();
        Anna.deposit(33);
        Anna.checkingBalance();// 33.0
        Anna.withDraw(13);

        Anna.checkingBalance();

        Anna.withDraw(30);


    }
}
