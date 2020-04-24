package day11_ScannerContinue;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
       System.out.println("Enter a long number");
        long a=input.nextLong();
        System.out.println("You have entered:"+a);

System.out.println("Enter a decimal:");
float b=input.nextFloat();
System.out.println(b);
double c=input.nextDouble();//it does not run
// double b=input.nextFloat() runs
System.out.println("you have entered:"+c);








    }
}
