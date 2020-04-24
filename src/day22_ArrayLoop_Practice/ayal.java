package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class ayal {
    public static void main(String[] args) {
        int[] numbers=new int[80];
        for(int i=19;i<=79;i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));

        for(int i=80;i>=20;i--){
            System.out.print(i+ " ");}
            for(int each:numbers){
                if(each%2==0){
                    System.out.print(each+" ");
                }
            }
        

    }
}
