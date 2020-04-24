package day16_forLoop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<=100;i++) {//even numbers
            if (i % 2 == 0) {
                sum += i;
            }else {
                sum2 += i;//odd numbers}
            }
        } System.out.println("sum of the even numbers:"+sum);
System.out.println("sum of the odd numbers: "+sum2);








    }
}
