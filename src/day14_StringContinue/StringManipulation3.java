package day14_StringContinue;

public class StringManipulation3 {
    public static void main(String[] args) {
        String s="CYBERTEK";
        String s1="cybertek";
        System.out.println(s.equalsIgnoreCase(s1));// true

    String x="Cybertek School";
    x.contains("School");
    boolean r=x.contains("School");// S if s it will be false
    System.out.println(r);// true


   String a="United States";
   System.out.println(a.startsWith("U"));

 String s3="Cybertek School";
 System.out.println(s3.endsWith("l"));//true



    }
}
