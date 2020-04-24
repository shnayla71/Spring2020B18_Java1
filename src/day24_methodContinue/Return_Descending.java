package day24_methodContinue;
import java.util.Arrays;
public class Return_Descending {
    public static void main(String[] args) {
        int[] arr1={1,10,5,8,4};
        int[] arr2={34,56,78,92};
        int[] arr3={100,200,400};

        arr1=Descending(arr1);
        arr2=Descending(arr2);
        arr3=Descending(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }


    public static int[] Descending(int[] arr){
        Arrays.sort(arr);
        int[] RevArr=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;arr.length>i;i++){
            RevArr[i]=arr[j];
            j--;}

        return RevArr;
    }




}
