package day13_newSubject;

public class homeHour {
    public static void main(String[] args) {
        String s1="cybertek";
        int name=s1.length();

        int total=s1.length()-1;
        System.out.println(total);
        String n1="today is a great day,for everyone";

        int n2=n1.length();
        System.out.println(n2);

     String n3="Cybertek";
     n3=n3.concat(" school");
     System.out.println(n3);

     String l="CYBERTEK";
     l=l.toLowerCase();
     System.out.println(l);

     String n="cybertek";
     n=n.toUpperCase();
     System.out.println(n);

    String s="         today     is    fun       ";
    s=s.trim();
    System.out.println(s);

    String name1="Cybertek is a good school";
    name1=name1.substring(0,8);
    System.out.println(name1);

        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);


        String fullname = "Rahman Abdalla";
        String firstName = fullname.substring(0,  fullname.indexOf(" ")  );
        String lastName = fullname.substring( fullname.indexOf(" ")+1 );

        System.out.println(firstName);
        System.out.println(lastName);






    }
}
