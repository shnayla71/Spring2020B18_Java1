package OfficeHours2_Arrays;

import java.util.Arrays;

public class Foreach_Loop {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        for(int each:arr){ // for(int i=0;i<arr.length;i++)
            if(each%2==0){ //oddnumbers
                continue;//3 atlar break; olsaydi sadece 1 2 yazardi
            }
            System.out.println(each);
        }





    }
}
