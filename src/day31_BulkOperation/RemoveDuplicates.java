package day31_BulkOperation;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));
        // expected result 1,2,3
        ArrayList<Integer> result=new ArrayList<>();// sonucu yazacagi liste icin yeni kume olusturdu

        for(Integer each:list) {   // each:1,1,2,2,3,3
            if (!result.contains(each)) {
                result.add(each);
            }
        }            System.out.println(result);

// write a program that can remove duplicates from an array
 //       of integer do not use for each

        Integer[] arr1={1,1,2,2,3,3};
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(!list1.contains(arr1[i])){
                list1.add(arr1[i]);

            }
        }
        System.out.println(list1);









    }
}
