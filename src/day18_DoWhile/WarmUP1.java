package day18_DoWhile;

public class WarmUP1 {
    public static void main(String[] args) {
   // 10/3=3 10-3-3-3=1     count=3

        int a=10;
        int b=3;

       if(b==0){System.exit(0);}//it is for stop down steps



        int count=0;
       while(a>=b){
           a-=b;
           count++;
       }
       System.out.println(count);
       System.out.println(a);//it is for remainder

        if(a==0){
            System.out.println("The result is "+ count);
        }else{System.out.println("the result is "+count + " with a remander "+a);}









    }
}
