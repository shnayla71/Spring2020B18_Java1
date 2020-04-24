package day25_warmUps;
//    Frequency("AAABB", "A");  ==> 3
//            Frequency("ABAB", "B"); ==> 2
public class WarmUp2 {
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
    
    public static void main(String[] args) {
        Frequency("aaabbc","b");

        String a="javajavajava";
        String b="ja";
       int c= Frequency1(a,b);
        System.out.println(c);
    }
}
