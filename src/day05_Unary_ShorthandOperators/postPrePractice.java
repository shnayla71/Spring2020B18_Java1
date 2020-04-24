package day05_Unary_ShorthandOperators;

public class postPrePractice {
    public static void main(String[] args) {
        int a =50;
        a= --a + a++ + a-- + a++;//49+49+50+49
        System.out.println(a);

        int b = 1;
        b = -b-- + b++ / -b-- * --b;
        System.out.println(b);// -1 +0/ -1* -1

System.out.println("B" +(1)+ (2));



    }






}
