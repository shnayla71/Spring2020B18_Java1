package day27_DateTime;
import java.util.Arrays;
public class TaskMinNum {
    public static void main(String[] args) {
        int[] arr2 = {4, 7, 9, 100, 74};
        System.out.println(minNum(arr2));

        double[] arr1={7.3,9.5,54.7,37.5,2.4};
        System.out.println(minNum(arr1));
    }

    public static int minNum(int[] arr) {

        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;

    }

    public static double minNum(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }




}