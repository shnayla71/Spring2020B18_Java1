package day08_IfStatement;

public class Equal_Numbers {
    public static void main(String[] args) {
        double n1 = 30;
        double n2 = 60;
        double n3 = 40;

        if( n1==n2 && n1 != n3){System.out.println("n1 is equal to n2");}
        if( n1==n3 && n1!=n2){System.out.println("n1 is equal to n3");}
        if( n2==n3 && n1!=n3){System.out.println("n2 is equal to n3") ;}
        if( n1==n3 && n2==n3){System.out.println(" all equal");}
        if( n1!=n2 && n2!=n3 && n1!=n3){System.out.println("none of them are equal");}
     System.out.println(" ======================");

        if( n1==n2 && n1 != n3){System.out.println(n1+" and"+n2+" are equal");}
     else   if( n1==n3 && n1!=n2){System.out.println(n1+" and"+n3+" are equal");}
     else   if( n2==n3 && n1!=n3){System.out.println(n2+" and"+n3+" are equal") ;}
     else   if( n1==n3 && n2==n3){System.out.println(" all equal");}
        else{System.out.println("none of them are equal");}






    }










}
