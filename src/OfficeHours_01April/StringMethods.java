package OfficeHours_01April;

public class StringMethods {
    public static void main(String[] args) {
        String str1="Java";
        char ch=str1.charAt(3);
        System.out.println(ch);
        String str2="Cybertek School";
        int num=str2.length();
    System.out.println(num);
    int maxIndex=str2.length()-1;
    char ch1=str2.charAt(maxIndex);
    System.out.println(ch1);


    //tolowercase and toUpperCase
        String str5="CYBERTEK";
        str5=str5.toLowerCase();
        System.out.println(str5);
        System.out.println("=================");
        String sentence="I like Java";
        String word1=sentence.substring(7,11);
        System.out.println(word1);
String word3=sentence.substring(2,6)+sentence.substring(7,sentence.length());
System.out.println(word3); // likeJava

        String sen1="I like to learn Java";
        String s1=sen1.substring(10);//"learn Java"
        System.out.println(s1);
        String r2="Java";//JaVa
        String r3=r2.substring(0,2);//Ja
        String r4=r2.substring(2,3);
               r4=r4.toUpperCase();// v turn V
        String r5=r2.substring(3);
        String result=r3+r4+r5;
        System.out.println(result);















    }
}
