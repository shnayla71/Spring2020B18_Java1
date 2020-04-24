package day13_newSubject;

public class StringManipulotions2 {
    public static void main(String[] args) {
        String str="Cybertek  School is the best";
       // index num 012345678
        String schoolName=str.substring(0,8);//0-7 writes cyberte
        System.out.println(schoolName);

        String fullname="Kuzzat Altay";
        String name=fullname.substring(0,6);
        String lastname=fullname.substring(7,12);//(7,40) error
        System.out.println(name);
        System.out.println(lastname);

        //fullname=firstname kastname
        //gmail:lastname_firstname@gmail.com
        String murtaza="Murtaza Nazeeri";
        String firstname=murtaza.substring(0,7);
        String lastname1=murtaza.substring(8,15);
        String gmail=lastname1.concat("_").concat(firstname);//.concat("@gmail.com") we can write
        String gmail2=gmail.concat("@gmail.com");

        System.out.println(gmail2);

String s1="I love Java programing language ";
//         01234567
String classname=s1.substring(7);
System.out.println(classname);// java programing language
        String s2="I like C# programing";
        s2=s2.replace("C#","Java");
System.out.println(s2);
String name2="Covid 18";
name2=name2.replace("18","19");
System.out.println(name2);

String r1="I like c#,c# iis fun,c# is cool";
r1=r1.replaceFirst("c#","java");
System.out.println(r1);







    }
}
