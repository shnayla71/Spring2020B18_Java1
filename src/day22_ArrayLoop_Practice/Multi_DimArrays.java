package day22_ArrayLoop_Practice;
import java.util.Arrays;
public class Multi_DimArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};//1D
        int[][] arr2D = {{1, 2, 3}}; //2D

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr2D[0][2]);

        for (int each : arr2D[0]) {
            System.out.println(each);
        }
        for(int i=0;i<arr2D[0].length;i++){
            int num=arr2D[0][i];
            System.out.print(num+" ");
        }


    }
}
