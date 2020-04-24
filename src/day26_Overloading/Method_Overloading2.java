package day26_Overloading;

import java.util.Arrays;

public class Method_Overloading2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        char[] arr2={'z','e','r'};
        double[] arr3={7.4,6.5,20.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);// here is overloading
        Arrays.sort(arr3);

    }






    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
}
