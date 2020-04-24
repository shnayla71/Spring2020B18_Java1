package day14_StringContinue;

import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first words");
        String word1=input.next();
        System.out.println("Enter second words");
        String word2=input.next();
        int length1=word1.length();
        int length2=word2.length();

        if(length1==5 && length2==5) {
          if(word1.charAt(length1-1)== word2.charAt(0))
          {System.out.println("fizz");}else
          {System.out.println("buzz");}

        }else{System.out.println("must be 5 chars");}













    }
}
