package day14_StringContinue;

public class StringManipulation {
    public static void main(String[] args) {
        String str="I like to learn Java. I like to watch movie Jumanji";
         int st=str.indexOf("J");//first matching one
        int a=str.indexOf(" I") + 1;
        System.out.println(a);

        String s="I like Java, I like reading";
        int b=s.lastIndexOf("l");
        System.out.println(b);

     String z="I like C#, C# is cool";
     int c=z.lastIndexOf("C#");
     System.out.println(c);

     String x="I like Java, Java is fun, Java programing is fun";
     int l=x.indexOf("Java is");//it returns first character J
     System.out.println(l);
    int l2=x.indexOf(", J")+2;// ,+ =2 character
    System.out.println(l2);
    int d=x.lastIndexOf("J");
    System.out.println(d);
    int y=x.indexOf("Java p");
    System.out.println(y);

    char ch1=x.charAt(26);
    System.out.println(ch1);// rteurns J







    }
}
