package day07_IfStatement;

public class mediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean aMid = (b < a && a<c) || (b>a && a>c) ;
        boolean bMid = (a < b && b<c) || (a>b && b>c);
        boolean cMid = (c<b && c > a) || ( c>b && c<a) ;

        if (aMid){System.out.println(a + " is mid number");}
        if (bMid){System.out.println(b+" is mid number");}
        if(cMid){System.out.println(c +" is mid number");}























    }
}
