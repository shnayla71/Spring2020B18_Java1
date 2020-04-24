package day20_ArrayContinue;
import java.util.Arrays;
public class Arrays_equal {
    public static void main(String[] args) {
        int[] arr={1,2,3,};
        int[] arr1={1,2,3};

        boolean result=Arrays.equals(arr,arr1);
        System.out.println(result);

        int[] arr5={3,2,1};
        int[] arr6={2,1,3};
        Arrays.sort(arr5);// 1,2,3
        Arrays.sort(arr6);// 1,2,3,

        boolean result1=Arrays.equals(arr5,arr6);
        System.out.println(result1);//true


    }
}
