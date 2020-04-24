package day22_ArrayLoop_Practice;
import java.util.Arrays;
public class Reversed_Word {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    for(int i=arr.length-1;0<=i;i--){
        System.out.println(arr[i]+" ");
    }
        System.out.println("======================");

       int[] RevArr=new int[arr.length];
       /*  RevArr[0]=arr[4];
         RevArr[1]=arr[3];
         RevArr[2]=arr[2]; */
        int j=arr.length-1;
      for(int i=0;i<arr.length;i++){
          RevArr[i]=arr[j];
          j--;
      }
        System.out.println(Arrays.toString(RevArr));






    }
}
