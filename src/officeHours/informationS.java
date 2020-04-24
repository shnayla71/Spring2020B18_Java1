package officeHours;

import java.util.Scanner;

public class informationS {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your fullname:");
        String fullname=scan.nextLine();

        System.out.println("Enter your salary:");
        double salary=scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your company:");
        String company=scan.nextLine();

        System.out.println("Enter your ssn:");
        int ssn=scan.nextInt();

        scan.nextLine();
        System.out.println("your full name: "+fullname);
        System.out.println("your salary: "+ salary);
        System.out.println("your company name: "+ company);
        System.out.println("your ssn: "+ ssn);






























    }
}
