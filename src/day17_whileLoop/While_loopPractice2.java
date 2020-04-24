package day17_whileLoop;

import java.util.Scanner;

public class While_loopPractice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter username:");
        String username=input.next();

        System.out.println("Enter password:");
        String password=input.next();

        boolean valid=username.equals("cybertek")&& password.equals("cybertek123");
        int count=1;
        while(!valid)
        { System.out.println("please re enter your credention");
            System.out.println("Enter username:");
             username=input.next();

            System.out.println("Enter password:");
             password=input.next();

        valid=username.equals("cybertek")&& password.equals("cybertek123");
        count++;
        if(count==3 && !valid){System.out.println("your account is locked");
        break;
        }

        }if(valid){
        System.out.println("logged in");}









    }
}
