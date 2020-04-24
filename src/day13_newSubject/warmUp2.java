package day13_newSubject;

import java.util.Scanner;

public class warmUp2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildging=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street adress:");
        String adress=scan.nextLine();
        System.out.println("Enter your city:");
        String city=scan.nextLine();
        System.out.println("Enter your state:");
        String state=scan.nextLine();
        System.out.println("Enter your zip code:");
        int code=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your full name");
        String fullname=scan.nextLine();
        System.out.println("Ship to: "+ fullname+"\n\t\t" +buildging+" "+ adress
        +"\n\t\t"+ city+","+state+" "+code);











    }
}
