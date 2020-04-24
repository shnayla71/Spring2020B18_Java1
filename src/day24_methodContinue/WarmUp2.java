package day24_methodContinue;

public class WarmUp2 {
    public static void Max(int num1,int num2){
        if(num1>=num2){
            System.out.println("max number: "+num1);
        }else{
            System.out.println("max number:"+num2);}
    }

    public static void Calculation(double num1,double num2,char operator){
        switch(operator){
            case '*':
                System.out.println(num1*num2);break;
            case '+':
                System.out.println(num1+num2);break;
            case '-':
                System.out.println(num1-num2);break;
            case '/':
                System.out.println(num1/num2);break;
            default:
                System.out.println("invalid");
        }
    }

public static void palindrome(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
    System.out.println(str.equalsIgnoreCase(reversed));

}





    public static void main(String[] args) {
        int num1=60;
        int b=80;
        Max(num1,b);

        Calculation(10,4,'*');

palindrome("level");
palindrome("cybertek");

    }












}
