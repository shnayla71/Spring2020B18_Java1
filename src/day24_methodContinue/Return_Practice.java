package day24_methodContinue;
import java.util.Arrays;
public class Return_Practice {
    public static void main(String[] args) {
        int[] arr={9,6,46,799,123,78,300};
        int max=maxNumber(arr);
        System.out.println(max);

        int min=minNumber(arr);
        System.out.println(min);

    }
    public static int maxNumber(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
}






}
