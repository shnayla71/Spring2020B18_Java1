package day23_CustomMethod;

public class Method_Parameters2 {
    public static void main(String[] args) {
        Reverse("ayla");
    }
    public static void Reverse(String word){
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }














}
