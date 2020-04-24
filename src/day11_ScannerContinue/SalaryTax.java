package day11_ScannerContinue;
import java.util.Scanner;
public class SalaryTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary=input.nextInt();
        System.out.println("Enter your state tax:");
        byte stateTax=input.nextByte();
        double stateTaxPercent=stateTax/100.0;
        System.out.println("Enter your federal tax:");
        byte federalTax=input.nextByte();
        double federalTaxPercent=federalTax/100.0;
        //totalTax=(federalTaxPercent+statetaxpercent)*salary
        double totalTax=(federalTaxPercent+stateTaxPercent)*salary;
        double SalaryAfterTax=salary-totalTax;
        System.out.println("Your salary after tax is: $"+ SalaryAfterTax);


















    }
}
