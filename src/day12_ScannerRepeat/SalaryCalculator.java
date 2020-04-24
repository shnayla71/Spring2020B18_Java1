package day12_ScannerRepeat;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary=scan.nextDouble();

        scan.nextLine();

        System.out.println("enter your fullname:");
        String fullname=scan.nextLine();

        System.out.println("Enter companyname");
        String companyname=scan.nextLine();

        System.out.println("Enter your ssn:");
        long ssn=scan.nextLong();

        scan.nextLine();

        System.out.println("enter your job title");
        String job=scan.nextLine();

        System.out.println("fullname is: "+fullname);
        System.out.println("job title is:"+job);
        System.out.println("COMPANYname: "+companyname);
        System.out.println("ssn is: "+ssn);
        System.out.println("salary is: "+salary);
































    }
}
