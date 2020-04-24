package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class NestedLoop_Dimensinal {
    public static void main(String[] args) {
                      //  0   1      0   1   2      0   1   2
        char[][] arr2D={{'A','B' },{'C','D','E' },{'F','J','H'}};
        //                  0            1               2
       for(int i=0;i<arr2D[0].length;i++){
           System.out.println(arr2D[0][i]);// each character written
       }

       for(int i=0;i<arr2D[2].length;i++){
           System.out.println(arr2D[2][i]);
       }

       for(int k=0;k<arr2D.length;k++){
           for(int i=0;i<arr2D[k].length;i++){
               System.out.println(arr2D[k][i]);// each character written
           }
       }
         /*     j    i
        arr2D    [0]   [0]
        arr2D    [0]   [1]
        arr2D    [1]   [0]
        arr2D    [1]   [1]
        arr2D    [1]   [2]
        arr2D    [2]   [0]
        arr2D    [2]   [1]
*/



    }
}
