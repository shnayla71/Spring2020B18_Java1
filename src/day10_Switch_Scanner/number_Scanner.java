package day10_Switch_Scanner;

import java.util.Scanner;

public class number_Scanner {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
     System.out.println("Enter first number");
     int num1= input.nextInt();
     System.out.println("Enter second number");
     int num2=input.nextInt();
     System.out.println("Enter third number");
     int num3= input.nextInt();

     int max=(num1>=num2 && num1>=num3)? num1:
             (num2>=num1 && num2>=num3)? num2:num3;
     System.out.println("max number is: " +max);








    }
}
