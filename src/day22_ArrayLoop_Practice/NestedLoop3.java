package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class NestedLoop3 {
    public static void main(String[] args) {

        int[][] numbers={{1,2,3},{4,5,6,7,8,9},
                         {10,11,12,13,14},
                       {15,16,17,18,19,20,21}};
         int countodd=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++) {
                int num = numbers[i][j];
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                } else {
                    countodd++;
                }
            } System.out.println(countodd);


                }
            }
        }











