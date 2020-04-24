package officeHours;

import java.util.Scanner;

public class cevap{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score=input.nextInt();
        String result=(score<60)? "Fail":
                (score>=60 && score<90)? "Pass":"Passed with dinstiction";
        System.out.println(result);


}}