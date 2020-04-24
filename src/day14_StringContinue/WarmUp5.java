package day14_StringContinue;

public class WarmUp5 {
    public static void main(String[] args) {
        String name="Java";
       // String name1=""+name.charAt(3)+name.charAt(2)+name.charAt(1)+name.charAt(0);
        //System.out.println(name1);
      name=name.substring(3)+name.substring(2,3)+name.substring(1,2)+name.substring(0,1);
      System.out.println(name);



    }
}
