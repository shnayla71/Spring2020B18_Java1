package day18_DoWhile;

public class Do_WhileEvenNumber {
    public static void main(String[] args) {
      int num=0;//even num
      do {
          if(num%2==0){// num!=0 it gives odd number

          System.out.print(num+" ");}
          num++;
      }while(num<=100);

      System.out.println();
     int i=1;
     do {
       //  i++; 2,3,4,5,6,
         System.out.println(i);
         i++;//1,2,3,4,5
     }while(i<=5);
System.out.println("===================");

      int z=1;
      do{
          System.out.println(z);
          if(z==3){
              break;// it writes 1,2,3
          }
          z++;
      }while(z<=5);
System.out.println("==================");
      int y=1;
      do{
          if(y==3){
              y++;// 1,2,4,5
              continue;
          }
          System.out.println(y);
          y++;
      }while(y<=5);
System.out.println("================");
     int t=1;
     do{
         if(t%2 != 0){
             t++;
             continue;
         }
         System.out.print(t +" ");
         t++;
     }while(t<=100);



    }
}
