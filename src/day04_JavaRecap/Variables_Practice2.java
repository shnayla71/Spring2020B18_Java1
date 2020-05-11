package day04_JavaRecap;

public class Variables_Practice2 {
    public static void main(String[] args) {
        //Datatype variableName = Data;
        byte num1=127;
        short num2 = num1; // double>float>long>int>short>byte
        // byte num3= num2; it is error because byte< short
        int num4= num2; // int is prefered by compiler
        long num5 = 99999999999l; //must write l
        float num6 = 100l;
        System.out.println(num6);// 100.0

        float num7 = 0.5f;
        System.out.println(num7);

        double num8 = 0.5f;
        double num9 = 999999l;
        System.out.println(num9);
        double num10 =100.5 ;

        char ch1='$';// it writes $. every single character has a corresponding number
        char ch2 = 22000;// 0 ~ 65565 range
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1);// writes 56 because it is a character

        // int a2 = 'z'; error because int only number not character
        int a2= 'z';
        System.out.println(a2);// it writes 122
        double d1 = 'z'+ '8'; // it writes 178.0
        char ch4 ='z'+ '8';// writes 2 it means 178 = 2 ascii num

        boolean bool1= true;
        boolean bool2= false;
        System.out.println( 9 > 10);// false
        System.out.println('a'=='b');// false
        System.out.println('a'=='b'-1);

        System.out.println("muhtar"!="good");// false it must be same ""

        boolean r1 =!true; // it turns false
        System.out.println(r1);// it prints false
        System.out.println(!r1); //it prints true











    }




}
