package day14_StringContinue;

import java.util.Scanner;

public class Warmup4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String name=input.next();
        System.out.println("Enter your second name");
        String name2=input.next();
      //  String name3=name.substring(0,1).toUpperCase()+name2.substring(0,1).toUpperCase();
         //name3=name3.toUpperCase();

        String name3= ""+name.charAt(0) + name2.charAt(0);//return us string not number
        name3=name3.toUpperCase();

        System.out.println(name3);










    }
}
