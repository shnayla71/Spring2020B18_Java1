package OfficeHours2_Arrays;

import java.util.Arrays;

public class Nested_loop {
    public static void main(String[] args) {
        int[][] numbers={
                {5,4,3,2,1,},
                {10,11,12,13,14,15},
                {16,17,18,19,20}
        };
        int count=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                if(numbers[i][j]%2 ==0 ){
                    ;
                }
                    System.out.println(count);
            }
        }


     for(int[]each1D:numbers) {
         for (int each : each1D) {
             if (each % 2 != 0) {
                 continue;
             }

             System.out.println(each+" ");
         }
     }




    }
}
