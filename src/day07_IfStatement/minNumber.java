package day07_IfStatement;

public class minNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300.5;
        boolean aSmaller = a<b && a<c ;
        boolean bSmaller = b<a && b<c ;
        boolean cSmaller = c<a && c<b ;

        if (aSmaller){System.out.println(a + " is min number");}
        if (bSmaller){System.out.println(b+" is min number");}
        if(cSmaller)
        {System.out.println(c +" is min number");}




















    }
}
