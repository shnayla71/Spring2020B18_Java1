package day14_StringContinue;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter word");
        String word=input.next();
        String middle="";//for finding middle character
        int total=word.length();//how many character are there
        int middleNumber=total/2;
        if(total%2 != 0){ middle =middle+ word.charAt(middleNumber);}
        else
        {middle=middle+word.charAt(middleNumber-1)+word.charAt(middleNumber);}
        System.out.println(middle);













}}
