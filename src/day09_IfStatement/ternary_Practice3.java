package day09_IfStatement;

public class ternary_Practice3 {
    public static void main(String[] args) {
        int age=80;
        String result="";
        String score=
        (age<3 && age>0)? result="baby" :
        (age>=3 && age<=5)? result="toddler":
        (age>=6 && age<=9)? result="kids":
        (age>=10 && age<=12)? result="pre-teen":
        (age>=13 && age<=17)? result="teenager":
        (age>=18 && age<=20)? result="young adult":
        (age>=21 && age<=39)? result="adult":
        (age>=40 && age<=49)? result="young middle aged-adult":
        (age>=50 && age<=54)? result="aged-adult":
        (age>=55 && age<=64)? result="young senior citizen":
        (age>=65 && age<=74)? result="moddle senior citizen":
        (age>=75 && age<=84)? result="senior citizen":
        (age>=85 && age<=120)? result="old senior citizen":
        "invailid entry";
        System.out.println(score);


        int num1=100;
        int num2=200;
        int min=(num1<num2)? num1:num2;
        System.out.println(min);

        int hour=14;
        String result1 = (hour<12)? "good morning":
                (hour>12 && hour<18)? "good afternoon ":" good evening";
        System.out.println(result1);
System.out.println("================================");

     int num=12000;
     boolean divisible=(num%3==0) && (num%5==0)? true:false;
     System.out.println(divisible);
































































    }
}
