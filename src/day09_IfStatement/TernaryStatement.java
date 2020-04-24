package day09_IfStatement;

public class TernaryStatement {
    public static void main(String[] args) {
        //ternary short cut of if statement
        int num=100;
        String result="";
        if (num%2==0){ result="even";}
          else{result="odd";}
          // ternary

        // in ternary ? mean = if , : = else

        String result2=( num%2==0)? "even" : "odd";
        System.out.println(result2);
System.out.println("====================");

    int num1 = 100;
    int num2 = 200;
    int max = 0;
    if(num1>num2){max=num1;} else{max = num2;}

    int max2=(num1>num2)? num1 : num2;
    System.out.println(max);
    System.out.println(max2);

    String str="";
    if(true){str="hello";}
      else{ str="hola";} System.out.println(str);

      String str2=(true)? "hello": "hola";
      System.out.println(str2);













    }







}
