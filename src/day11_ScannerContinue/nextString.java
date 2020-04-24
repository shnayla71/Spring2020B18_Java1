package day11_ScannerContinue;
import java.util.Scanner;
public class nextString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your firstname:");
        String name=input.next();


        System.out.println("Enter last name:");
        String lastName=input.next();

        System.out.println("Are you employeed?");
        boolean status=input.nextBoolean();
double salary=0;
if(status==true){
    System.out.println("Enter your salary");
     salary=input.nextDouble();
}




        String fullname=name+" "+lastName;
        System.out.println(fullname);
        System.out.println(status);
System.out.println(salary);

    }
}
