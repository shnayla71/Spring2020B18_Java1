package day18_DoWhile;

public class String_Reverse {
    public static void main(String[] args) {
     String s="Java";
     String rev="";
     int last=s.length()-1;

     do{

         rev += s.charAt(last);

         last--;
     }while(0<=last);
     System.out.println(rev);





















    }
}
