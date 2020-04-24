package day21_MultiDimential;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Java";//'j','a','v','a
        char[] chars=name.toCharArray();

        System.out.println(chars[0]);//'j'

        String str="I like Java";
         String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));


        //reverse ; day great is today
        String sentence="Today is great day";
        String[] word=sentence.split(" ");

        System.out.println(Arrays.toString(word));
         //String result="";
        for(int i= word.length-1;i>=0;i--){
             String eachword = word[i];
             System.out.print(eachword+ " ");
         // result += eachword+" ";
        }
        System.out.println();
       String str1="ABCD";
        String arr1[]=str1.split("");
      // char [] ch2=str1.tocharArray();
        System.out.println(Arrays.toString(arr1));



    }
}
