package day21_MultiDimential;

import java.text.DecimalFormat;

public class formatting_Decimal {
    public static void main(String[] args) {
        DecimalFormat DF=new DecimalFormat("0.00");

        double a=10.0/3.0;
        System.out.println(a);// 3.3333333
        System.out.println(DF.format(a));// 3.33/ 0.00 yazdigimiz icin

System.out.println(2.3467899);
System.out.println(DF.format(2.3467899));






    }
}
