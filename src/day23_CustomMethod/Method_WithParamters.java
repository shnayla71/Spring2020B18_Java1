package day23_CustomMethod;

import java.util.Scanner;

public class Method_WithParamters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age");
        byte age=scan.nextByte();
        EligableToBuyAlchol(age);
    }

    public static void EligableToBuyAlchol(byte age){
        if(age>=21){
            System.out.println("Eligable to buy alchool");
        }else{
            System.out.println("Eligable to buy milk");
        }

    }
}
