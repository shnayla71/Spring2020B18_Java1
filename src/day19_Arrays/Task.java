package day19_Arrays;

public class Task {
    public static void main(String[] args) {
        String str="AABCC";
        String result="";

        for(int j=0; j<=str.length()-1;j++) {

            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(j)) {//check how many character occured
                    count++;
                }//unique olmayanlar icin
            }
            if (count == 1) {
                result += str.charAt(j);
            }

        }System.out.println(result);





    }
}