package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class Count_odd_even {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        int countodd=0;
        int counteven=0;

        for(int each:arr){
            if(each%2 !=0){
                countodd++;
            }else{ counteven++;}

        }
        System.out.println("count odd: "+countodd);
        System.out.println("count even: "+counteven);








    }
}
