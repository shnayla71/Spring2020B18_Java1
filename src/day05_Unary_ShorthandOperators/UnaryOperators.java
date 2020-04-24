package day05_Unary_ShorthandOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;// positive 10
        int b = +a;
        System.out.println(a);// or b same 10
        int c = -10;
        boolean result = c> 0 ;
        boolean result2 = c< 0;
        System.out.println(result2);

        int x1 = - 10;
        int y1 = -x1; // turns + 10 like math
        System.out.println(y1);

        int x2 = +20;
        int y2 = - x2;// runs -20
        System.out.println(y2);

        int x3 = +20;
        int y3 = +x3; // positive 20

        int z = 100;
        System.out.println(++z);// 101 increase immediately
        System.out.println(--z);// 99
        int p = 100;
        System.out.println( p++);// 100 first current value
        System.out.println( p);// 101 increases the value
        System.out.println( p--);// 101





















    }
}
