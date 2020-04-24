package day11_ScannerContinue;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=input.nextInt();//30+ enter
        System.out.println("Your age is: "+age);
        input.nextLine();

        System.out.println("Enter your fullname:");
        String fullname=input.nextLine();
        System.out.println("Your fullname is: "+fullname);










    }
}
