package day29_Wrapper_ArrayList;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str="123";
        Integer a=Integer.valueOf(str); //123
        System.out.println(a);

        double b=Integer.valueOf(str);
        System.out.println(b);//123.0

        String str2="15.5";
        double d1=Double.parseDouble(str2);
        // double=double//none
        double d2=Double.valueOf(str2);
       // double=Double // unboxing
        System.out.println(d1);// 15.5
        System.out.println(d2);//15.5
        System.out.println("=====================================");

        Short sh1=3000;
        int z2=sh1;
          int i=100;//we can not do like this
       // Long l=i;



    }
}
