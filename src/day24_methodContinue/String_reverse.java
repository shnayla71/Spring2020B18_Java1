package day24_methodContinue;

public class String_reverse {
    public static void main(String[] args) {
        Reverse("cybertek");
       String name= Reverse2("cyberschool");
        System.out.println(name);
    }
    public static void Reverse(String str){
        String Reverse="";
        for(int i=str.length()-1;i>=0;i--){
            Reverse += str.charAt(i);
        }
        System.out.println(Reverse);
    }

   public static String Reverse2(String str){
       String Reverse="";
       for(int i=str.length()-1;i>=0;i--){
           Reverse += str.charAt(i);
       }
       return Reverse;
   }




}
