package day26_Overloading;

public class WarmUpTask2 {
    public static void main(String[] args) {
        String str="ABBCDF";
        String result="";

        for(int i=0;i<str.length();i++) {
            int num = frequency2(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
        String str2="cybertek";
        String a= uniques(str2);
        System.out.println(a);
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
