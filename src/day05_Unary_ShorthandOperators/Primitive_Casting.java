package day05_Unary_ShorthandOperators;

public class Primitive_Casting {
    public static void main(String[] args) {
        //implicit casting done automaticly
        int a = 10;
        long b = a;// implicit casting automaticly
        // b=10l;
       // int c = b; is still long datatype
        int a1 = 100;
        long b1 = (long)a1;// manually doing the implicit casting

        //explicit casting
        int Inum= 100;
        byte Bnum= (byte)Inum;
        short Snum = (short)Inum;// we can write byte

        double Dnum= 5.5;
      //  float Fnum = (float)Dnum;
        float Fnum = (int)Dnum;// write 5.0

        System.out.println(Fnum);
        System.out.println(Fnum + 1);
      double D1= 10.5;
      //long L1= (long) ((float )D1);
      long L1 = (int) D1;// writes 10 because int,short and long for whole numbers
        float F1 = 60.5f;
        int I1= (int) F1;// short and byte can we use
    System.out.println(I1);
        long largeNum = 99999999999l;
        int intNUM = (int)largeNum;
        System.out.println(intNUM);
        char ch1= 'a';
        short sh1 = (short) ch1;
        System.out.println(sh1);
        char ch2 = 23456;
        double dbl1 = ch2;
        System.out.println(dbl1);





    }







}
