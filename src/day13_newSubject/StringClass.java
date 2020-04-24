package day13_newSubject;

public class StringClass {
    public static void main(String[] args) {
        String str1="cat";
        String str2=new String("cat");
        System.out.println(str1+ " "+str2);
System.out.println(str1==str2);//it says false
        String str4=new String("cat");
        System.out.println(str2==str4);// false

        String s1="Java";//string pool
        s1="JavaScript";
        System.out.println(s1);//writes JavaScript

        String s2="Java";
        System.out.println(s2);
        System.out.println(s1==s2);// false







    }
}
