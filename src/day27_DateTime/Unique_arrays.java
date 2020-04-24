package day27_DateTime;

public class Unique_arrays {
    public static void main(String[] args) {
        int[] arr2={3,3,4,5,6,7,7,8,8};
        unique(arr2);
    }

    public static void unique(int[] arr) {
        for (int each1 : arr) {
            int count = 0;
            for (int each : arr) {
                if (each == arr[each1]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[each1]);
            }
        }

    }




}
















