package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str="123";
        int a= Integer.parseInt(str);//returns 123 int olarak
        System.out.println(str+1); //text 1 concanitation //1231
        System.out.println(a+1);  //number adition //124

        byte b1=Byte.parseByte(str);// byte=123
        System.out.println(b1); //123

        // Integer I1=Byte.parseByte(str);
        Integer I1=(int)Byte.parseByte(str);//accept AutoBoxing

        String str1="10.5";
         float f1=Float.parseFloat(str1);// 10.5

         double d1=Double.parseDouble(str1);
        System.out.println(d1+1);

        String str2="3147483647";
        long l1=Long.parseLong(str2);
        System.out.println(l1+ 2);

        String result="true";
        boolean b2=Boolean.parseBoolean(result);
        System.out.println(b2);  // !b2 =false
        // tRuE it isnot case sensetive so return true

        String res1="Today is Monday";
        boolean b3=Boolean.parseBoolean(res1);
        System.out.println(b3);// return false

        String r2="fAlsE";
        boolean r3=Boolean.parseBoolean(r2);
        System.out.println(r3);// false ignore to case sensetive


    }
}
