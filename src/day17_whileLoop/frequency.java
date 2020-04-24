package day17_whileLoop;

public class frequency {
    public static void main(String[] args) {
        String str="java is fun,java is cool";//ABC
                 // "cybertek school is great place" only e how many
        int count=0;
        while(str.contains("java") ){//"e"
            count++;
            str=str.replaceFirst("java","");}
        System.out.println(count);//"e",""










    }
}
