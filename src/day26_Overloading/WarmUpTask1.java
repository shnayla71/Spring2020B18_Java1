package day26_Overloading;

public class WarmUpTask1 {
    public static void main(String[] args) {
       String str="AAA";
       char ch='A';
       int count=0;
       char[] arr=str.toCharArray();
       for(char each:arr){
           if(each==ch){
               count++;
           }
       }
        System.out.println(count);
       String str1="ABCDBBBBAAAB";
       char ch1='B';
       int result=Frequency2(str1,ch1);
        System.out.println(result);
    }

    public static int Frequency2(String str,char ch) {

        int count = 0;
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;


    }

}
