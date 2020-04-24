package day20_ArrayContinue;
import java.util.Arrays;
public class Array_Char {
    public static void main(String[] args) {

        String str="AYLA SAHIN";
        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));

        String str1="Cybertek School";
        String str2="School Cybertek";

        char[] ch1=str1.toCharArray();// c,y,b,e,r,t,e,k,s,h,c,o,o,l
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);// [,C,S,b,c,e,e,h,k,l,o,o,r,t,y]
        Arrays.sort(ch2);

        boolean result=Arrays.equals(ch1,ch2);
        System.out.println(result);











    }
}
