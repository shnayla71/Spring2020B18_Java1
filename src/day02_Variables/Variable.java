package day02_Variables;

public class Variable {
    public static void main(String[] args) {
        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
// byte num1 = 130; exceeds the range of byte

        short num3 = 1000;
        System.out.println(num3);

        int n1 = 20000;
        int n2 = 1000000000;
        System.out.println(n2); //n3=999999999 it is out of range
      // longn4=999999999l // forcefully telling the complier that this is long data number
        System.out.println(999999999l);
      // int num = 7L ; larger one cannot be assigned to smaller one
        System.out.println(3.5);
         double d1=3.5;
// float f1=4.5; double primative is larger than float primitive
        float f2 = 5.5f;
        System.out.println(f2);
        float pi = 3.14f;
        double p = 3.14f;






    }





}
