package day13_newSubject;

public class StringManipulotion3 {
    public static void main(String[] args) {
        String str="I like Java";
        // index    01234567
        int num1=str.indexOf("J");
        System.out.println(num1);//7
String r2="Cybertek school is awesome";
int firstS=r2.indexOf("s");//9
int secondS=r2.indexOf("is")+1;// i
System.out.println(firstS);
System.out.println(secondS);

String fullname="Ayla Shin";
String name1=fullname.substring(0, fullname.indexOf(" "));
String name2=fullname.substring(fullname.indexOf(" ")+1);
System.out.println(name1);
System.out.println(name2);











































    }
}
