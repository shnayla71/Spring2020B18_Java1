package day18_DoWhile;

import java.util.Scanner;

public class factoryel_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        long  num=input.nextInt();
        long result=1;
        while(num>=1){
            result *= num;

            num--;
        }
        System.out.println(result);







    }
}
