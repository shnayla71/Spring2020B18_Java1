package day17_whileLoop;

import java.util.Scanner;

public class WarmUPMx_num {
    public static void main(String[] args) {
        // max and min num
        Scanner input = new Scanner(System.in);
       /* int maxNumber= -999999999;// any number user wrote could be greater than this
        for( int i=1;i<6;i++){
        System.out.println("Enter a num:");
        int num=input.nextInt();
        if(num>maxNumber){//to compare each user input
            maxNumber=num;
        }}
        System.out.println(maxNumber); */

        int minNumber = 1999999999;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num < minNumber) {
                minNumber=num;
            }
        }
        System.out.println(minNumber);



    }

}


























