package day18_DoWhile;

import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  while(true){
        System.out.println("Which bedroom do you want to reserve?");


            String answer = input.next();
            int king1 = 120;
            int queen1 = 100;
            int single1 = 80;
            if (answer.equalsIgnoreCase("king")) {
                System.out.println("Price: " + king1);

            } else if (answer.equalsIgnoreCase("queen")) {
                System.out.println("Price: " + queen1);
            } else if (answer.equalsIgnoreCase("single")) {
                System.out.println("Price: " + single1);
            }
            System.out.println("Dou you want to reserve another room?");
            String answer1 = input.next();
            if (!((answer1.equalsIgnoreCase("yes")) || (answer1.equalsIgnoreCase("no")))) {
                System.out.println("invalid entery please try again");
            }
            if (answer1.equalsIgnoreCase("no")) {
                System.out.println("Thank you!");
                break;
            }

        }
    }
}