package day07_IfStatement;

public class maxNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300.5;
        boolean aGreater = a>b && a>c ;
        boolean bGreater = b>a && b>c ;
        boolean cGreater = c>a && c>b ;

        if (aGreater){System.out.println(a + "is max number");}
        if (bGreater){System.out.println(b+" is max number");}
        if(cGreater){System.out.println(c +"is max number");}


















    }
}
