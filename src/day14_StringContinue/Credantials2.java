package day14_StringContinue;

import java.util.Scanner;

public class Credantials2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first words");
        String word1=input.next();
        System.out.println("Enter second words");
        String word2=input.next();
        System.out.println("Enter third words");
        String word3=input.next();

        int length1=word1.length();
        int length2=word2.length();
        int length3=word3.length();

        boolean allNotSame=length1!=length2 && length1!=length3 && length2!=length3;

        if(length1==length2 && length2==length3){System.out.println("All words are same length");}
        else if(allNotSame){System.out.println("All different");}
        else{System.out.println("Not same nor different length");}















    }
}
