package day25_warmUps;
import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str="ABCDABADBAAC";
      String result=  Library.RemDup(str);
        System.out.println(result);
        String strA="aaabbcdgb";
        String result1=Library.FrequencyOfChars(strA);
        System.out.println(result1);
    }
}
