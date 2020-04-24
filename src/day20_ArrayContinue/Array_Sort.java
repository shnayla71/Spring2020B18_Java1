package day20_ArrayContinue;
import java.util.Arrays;
public class Array_Sort {
    public static void main(String[] args) {
        int[] arr1={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("min number is: "+arr1[0]);
         System.out.println("max num is: "+arr1[arr1.length-1]);

     char[] ch={'Z','W','Y','A','B','E','D'};
       Arrays.sort(ch);
       System.out.println(Arrays.toString(ch));

       String[] names={"deniz","osman","rustem","ali"};
        Arrays.sort(names);//ascii table uppercase comes before lowercase
       System.out.println(Arrays.toString(names));
      System.out.println("=======================");
       int[] arr={10,20,3,1,100,155};
       Arrays.sort(arr);
        int[] arrDes=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
           //System.out.print(arr[i]+" ");
          arrDes[j]=arr[i];
            j++;
        }
     System.out.println(Arrays.toString(arrDes));





    }
}
