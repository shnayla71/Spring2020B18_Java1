package OfficeHours_loop;

import java.util.Scanner;

public class Max_MinNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int max=-2147483648;
        int min=2147452678;
        int i=1;
        while(i<=3) {

            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if(num<min){
                min=num;
            }
            i++;
        } System.out.println(max);
          System.out.println(min);






    }
}
