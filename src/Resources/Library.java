package Resources;
import java.util.Arrays;
public class Library {
    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }

    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";
        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
        return  Reverse;
    }

    public static String RemDup(String str) {
        String nonDuplicate="";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!nonDuplicate.contains("" + str.charAt(i))) {
                nonDuplicate += str.charAt(i);
            }
        }
        return nonDuplicate;
    }

    public static void Frequency(String str1,String str2) {
            int count = 0;
            char ch=str2.charAt(0);
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i)==(ch)) {

                    count++;
                }}
            System.out.println(count);

        }

        public static int Frequency1(String str1,String str2){
            int count=0;
            while(str1.contains(str2)){
                count++;
                str1=str1.replaceFirst(str2,"");
            }
            return count;
        }

    public static String FrequencyOfChars(String str) {
        String NonDup = Library.RemDup(str);
        String result="";
        for(int i=0;i<NonDup.length();i++){
            String ch=""+ NonDup.charAt(i); // A
            int num=Library.Frequency1(str,ch);
            result+=ch+num;}
        return result;
    }

    public static int frequency2(String str,char ch) {

        int count = 0;
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;


    }

    public static String uniques(String str){
        String result="";

        for(int i=0;i<str.length();i++) {
            int num = frequency2(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }




}
