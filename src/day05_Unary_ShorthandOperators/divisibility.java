package day05_Unary_ShorthandOperators;

public class divisibility {
    public static void main(String[] args) {
        int number = 65 ;
        boolean divisableBy2 = number % 2 ==0 ;
        boolean divisableBy3 = number % 3 == 0;
        boolean divisableBy5 = number % 5 == 0;

                String result3= number+ " is divisible by 3: "+ divisableBy3;
                String result5= number +" is divisible by 5: "+ divisableBy5;
                System.out.println( result3 + "\n"+ result5+"\n");


        System.out.println(number + " is divisible by 2:  "+ divisableBy2);





    }










}
