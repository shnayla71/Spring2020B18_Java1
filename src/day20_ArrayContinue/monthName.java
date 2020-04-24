package day20_ArrayContinue;

import java.util.Scanner;

public class monthName {
    public static void main(String[] args) {
        String[] months={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        //String[] months2=new String[12];
        // months2[0]="JAN";
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();

        while(num>12 || num<=0){
            System.out.println("invalid entry");
            System.out.println("please re enter a number");
            num=input.nextInt();
        }

        String result=months[num-1];

        System.out.println(result);





    }
}
