package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class NestedLoop2 {
    public static void main(String[] args) {
        int[][] numbers={{9,8,7},{6},{5,4,3,2,1,0}};


        for(int j=0; j<numbers[0].length;j++){
            System.out.println(numbers[0][j]);
        }
         for(int k=0;k<numbers.length;k++) {
             for (int j = 0; j < numbers[k].length; j++) {
                 System.out.print(numbers[k][j] + " ");
             }
             System.out.println();
         }


        for(int k=numbers.length-1;k>=0;k--) {
            for (int j = 0; j < numbers[k].length; j++) {
                System.out.print(numbers[k][j] + " ");
            }}
        System.out.println();

        for(int k=0;k<numbers.length;k++){
          for(int j=numbers[k].length-1;j>=0;j--){
               System.out.print(numbers[k][j] +" ");
    }
}
        System.out.println();
       for(int k=numbers.length-1;k>=0;k--){
           for(int i=numbers[k].length-1;i>=0;i--){
               System.out.print(numbers[k][i]+" ");
           }
       }












    }
}
