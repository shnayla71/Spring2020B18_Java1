package officeHours;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
public class cevap {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:a");
        LocalTime time1 = LocalTime.of(21, 23);
        System.out.println(time1.format(dtf));

        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        Arrays.sort(arr);
        int result =0;
        for(int i=0;i<=arr.length-1;i++) {
            if (arr[i] != i + 1) {
                result = i + 1;
                break;
            }
        }  System.out.println(result);

int num=1231;
if(num%2 <= 1){
    System.out.println("true");
}else{
    System.out.println("false");
}
   int a=27;
   int b=5;
   while(a>=b){
       a -= b;
   }
        System.out.println(a);

 int[] arr1={2,3,4};
 int a1=5;
      int[] yeni=new int[arr1.length+1];
      for(int i=0;i<arr1.length;i++){
          yeni[i]=arr1[i];
      }yeni[yeni.length-1]=a1;
        System.out.println(Arrays.toString(yeni));





    }
}