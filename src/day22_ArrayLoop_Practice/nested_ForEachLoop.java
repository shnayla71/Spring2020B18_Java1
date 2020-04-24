package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class nested_ForEachLoop {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        for(int each:arr){
            System.out.println(each);
        }
        System.out.println("====================");
        int[][] arr2D={{1,2,3},{4,5,6}};

        for(int[] each1Darr :arr2D){
            for(int each :each1Darr){
                System.out.print(each+" ");
            }
        }
        System.out.println();

        char[][] ch2D={{'A','B'},{'C','D','E'}};

        for(char[] ch1D:ch2D){
            for(char ch:ch1D){
                System.out.print(ch+" ");
            }
        }



    }
}
