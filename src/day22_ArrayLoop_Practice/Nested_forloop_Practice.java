package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class Nested_forloop_Practice {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},{4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}};

       int count=0;
       int sumofeven=0;
       int sumofodd=0;
        for(int[] num1:numbers){
            for(int each:num1){
                if(each%2 == 0){
                    sumofeven +=each;
                System.out.print(sumofeven+" ");
                }else{
                    sumofodd += each;
                    count++;//odd number sayisi
                }
            }
        }
        System.out.println();
        System.out.println(sumofeven);
        System.out.println(sumofodd);








    }
}
