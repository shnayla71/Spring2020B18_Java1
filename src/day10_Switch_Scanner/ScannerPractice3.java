package day10_Switch_Scanner;
import java.util.Scanner;
public class ScannerPractice3 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("Enter your salary:");
       int num1=input.nextInt();
        System.out.println("how many hours work in a week");
        int num2= input.nextInt();
        int total= num1/(num2*52);
        System.out.println("your hourly rate: " + total);








    }
}
