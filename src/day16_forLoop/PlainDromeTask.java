package day16_forLoop;

import java.util.Scanner;

public class PlainDromeTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scan.nextLine();
        String reverse="";
        for(int i=word.length()-1; i>=0 ; i--){
        reverse += word.charAt(i);}
        boolean palindrome=word.equalsIgnoreCase(reverse);
        System.out.println(palindrome);










    }
}
