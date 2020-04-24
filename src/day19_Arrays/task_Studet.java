package day19_Arrays;

import java.util.Scanner;

public class task_Studet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
          int num=input.nextInt();
        String[] students=new String[10];
        // write program that enter a name 10 times,each name in the array student
          students[1]="ayse";
        students[2]="ayten";
        students[3]="aysun";
        students[4]="aynur";
        students[5]="aysima";
        students[6]="aygun";
        students[7]="aysel";
        students[8]="aysecik";
        students[9]="aysegul";

        System.out.println("you choose:" +students[num]);
    }
}
