package day24_methodContinue;
import java.util.Arrays;
public class WarmUp1 {




    public static void MaxNumber(int[] array){
        Arrays.sort(array);
        System.out.println(array[array.length-1]);

    }

    public static void MinNumber(int[] array){
        Arrays.sort(array);
        System.out.println(array[0]);
    }

public static void Descending(int[] array){
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+ " ");
        }
    System.out.println();
}


    public static void main(String[] args) {
        int[] arr={10,8,9,5,4,3,2,1};
        MaxNumber(arr);
        MinNumber(arr);
        Descending(arr);
    }




}


