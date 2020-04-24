package day18_DoWhile;

public class Nested_loop2 {
    public static void main(String[] args) {
      /*
      *
      * *
      * * *
      * * * *
      * * * * *
        */
      for(int l=1;l<=5;l++) {
          for (int i = 1; i <= l; i++) {
              System.out.print("* ");
          }
          System.out.println();
      }
System.out.println("=======================");
for(int n=9;n>=1;n--){
    for(int m=1;m<=n;m++){
        System.out.print("* ");
    }System.out.println();
}
/*
  a
  a b
  a b c
  a b c d
*/
   for(char z='a';z<='e';z++) {
       for (char ch = 'a'; ch <= z; ch++) {
           System.out.print(ch + " ");
       }
       System.out.println();
   }
   System.out.println("=====================");
        for(char z='z';z<='a';z--) {
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }











    }
}
