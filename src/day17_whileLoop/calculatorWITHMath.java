package day17_whileLoop;

import java.util.Scanner;

public class calculatorWITHMath {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    for(int i=0;i==0;){//can write true or i>-10 second part
        System.out.println("Enter the first number");
        int num1=scan.nextInt();
        System.out.println("Enter the second number");
        int num2=scan.nextInt();
        System.out.println("Math operator: ");
        String operator=scan.next();// +,-,*,/,%
// if we use char operator=scan.next().charAt(0)
        if(operator.equals("+")){// we must write operator=="+"
            System.out.println("Adition: "+(num1+num2));
        }else if(operator.equals("-")){
            System.out.println("Subtraction: "+(num1-num2));
        }else if(operator.equals("*")){
            System.out.println("Multiplication: "+(num1*num2));
        }else if(operator.equals("/")){
            System.out.println("Division: "+(num1/num2));
        }else if(operator.equals("%")){
            System.out.println("Remainder: "+(num1%num2));
        }else{System.out.println("invalid");}
System.out.println("do you need to continue?");
String answer=scan.next();
if(answer.equalsIgnoreCase("no")){
    break;
}}






















    }
}
