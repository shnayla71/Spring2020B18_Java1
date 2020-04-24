package day13_newSubject;

public class StringManupilations {
    public static void main(String[] args) {
        String str="Cybertek";
        // index:   01234567
        char ch=str.charAt(5);// it means t
        System.out.println(ch);//writes t

        int totallenght=str.length();
//total number of characters cybertek=8
        System.out.println(totallenght);//  totallenght>250

        String s1="cybertek";
        s1=s1.concat("school");
    System.out.println(s1);//writes cybertek school

        String s2="Java";
        s2=s2.concat(" is a programing language");
        System.out.println(s2);// System.out.println(s2.concat(" is a programing language")
String name="CYBERTEK";
       name=name.toLowerCase();
       System.out.println(name);
     String name2="cybertek school";
     name2=name2.toUpperCase();
     System.out.println(name2);

     String A1="     today is great day";
     A1=A1.trim();
     System.out.println(A1);







    }
}
