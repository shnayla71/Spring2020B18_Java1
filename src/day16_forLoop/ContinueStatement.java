package day16_forLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {// i= 1,2,3,4,5
            if (i == 3) {
                continue;
            }// i=1,2,4,5
            System.out.println(i);
        }
      for(int i=0;i<=20;i++){
          if(i%2 !=0){continue;}
          if(i%2 ==0){continue;}//skip
          System.out.println(i+" ");

      }






    }
}
