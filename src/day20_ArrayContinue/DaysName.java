package day20_ArrayContinue;

import java.util.Scanner;

public class DaysName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
      int num=input.nextInt();
      int attepmts=1;
      while(num>7 || num<1) {
          System.out.println("invalid entery");
          System.out.println("PLEASE enter a number");
          num = input.nextInt();
          attepmts++;

        if(attepmts==3 && (num>7 || num<=0)) {
            System.out.println("don't try again ");
            System.exit(0);}
        }

         String result=days[num-1];
         System.out.println(result);






    }
}
