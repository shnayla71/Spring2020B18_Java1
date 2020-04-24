package OfficeHours2_Arrays;

import java.util.Arrays;

public class Equal_Arrays {
    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);//eger kumeler karisik dizilmis olsaydi
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println("=============================");
/* string
   tocharAt: returns char array
   split
 */
    String str="Cybertek";
    char[] ch=str.toCharArray();// ['C','y','b' ,.......]
        System.out.println(str.length()==ch.length);//true

     /*
     str="abc"  ,str2="cba"
      */
      String str1="abc";
      String str2="bca";
      char[] ch1=str1.toCharArray();
      char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        System.out.println(Arrays.equals(ch1,ch2));

    }
}
