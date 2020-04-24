package day25_warmUps;
/*
  FrequencyOfChars("ABABCB"); ==> "A2B3C1";
            FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
*/

import Resources.Library;

public class WarmUp3 {

 public static String FrequencyOfChars(String str) {
     String NonDup = Library.RemDup(str);
     String result="";
     for(int i=0;i<NonDup.length();i++){
         String ch=""+ NonDup.charAt(i); // A
         int num=Library.Frequency1(str,ch);
         result+=ch+num;}
     return result;
 }
    public static void main(String[] args) {
      String str="AABBCCC";
     String str1=FrequencyOfChars(str);
        System.out.println(str1);
 }


}
