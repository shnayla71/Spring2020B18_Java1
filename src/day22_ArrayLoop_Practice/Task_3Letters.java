package day22_ArrayLoop_Practice;

import java.util.Scanner;
import java.util.Arrays;
public class Task_3Letters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
             arr[i]=input.next();
        }
        System.out.println(Arrays.toString(arr));
        String result="";
        for(String each:arr) {
           // result = each.substring(0, 3); // first 3 letter
           result=each.charAt(0)+""+ each.charAt(each.length()-1);// first and last character
            System.out.print(result+ " ");
        }




    }
}
