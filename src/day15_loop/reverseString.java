package day15_loop;

public class reverseString {
    public static void main(String[] args) {
      /*  String str="Java";
        int lastletter=str.length()-1;

        for(int i=lastletter;i>=0; i--){
        System.out.print(str.charAt(i));
        }*/

        String name= "level";  //avaJ
        //    012345678
       int lastIndexnum=name.length()-1;
        String reverse2 = "";
        for(int i = lastIndexnum; i>=0 ; i-- ){
            //  System.out.print(str.charAt(i));
            reverse2 += name.charAt(i);
        } System.out.println(name.equalsIgnoreCase(reverse2));












    }
}
