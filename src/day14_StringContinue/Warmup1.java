package day14_StringContinue;

import java.util.Scanner;

public class Warmup1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first words:");
        String word1=scan.next();
        System.out.println("Enter second word");
        String word2=scan.next();

        String word3=word1.concat(word2).concat(word2).concat(word1);
        System.out.println(word3);// if need space concat(" "+word2)










    }

}
