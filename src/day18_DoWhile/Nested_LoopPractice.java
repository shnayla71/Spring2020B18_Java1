package day18_DoWhile;

import java.util.Scanner;

public class Nested_LoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      while (true){
        System.out.println("Enter two numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("Adition= " + (n1 + n2));
        System.out.println("Do you want to continue");
        String answer = input.next();
        if(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")))
          {System.out.println("invalid entry!please re enter two numbers");}
          if (answer.equalsIgnoreCase("no")) {
            System.out.println("thank you");
            break;
        }
    }







    }
}
