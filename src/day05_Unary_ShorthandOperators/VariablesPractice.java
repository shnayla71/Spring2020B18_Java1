package day05_Unary_ShorthandOperators;

public class VariablesPractice {
    public static void main(String[] args) {
        // whole number : byte, short,int,long
        // decimal: float,double
        int a1 = 100;
        float f1 = (long) a1;// f1 = 100.0;
        System.out.println(f1);
        long l1 = (long) f1;// l1=100 long is whole number
        System.out.println(l1);







    }
}
