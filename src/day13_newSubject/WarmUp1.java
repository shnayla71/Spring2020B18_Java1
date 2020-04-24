package day13_newSubject;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        byte num=input.nextByte();
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("invalid");
                break;
        }

            String result1=(num==0)? "zero":
                    (num==1)? "one":(num==2)? "two":(num==3)? "three":(num==4)? "four":(num==5)? "five":(num==6)? "six":(num==7)? "seven":(num==8)? "eight":(num==9)? "nine":"invalid";
            System.out.println(result1);






        }











    }

