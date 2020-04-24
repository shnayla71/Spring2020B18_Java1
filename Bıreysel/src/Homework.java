public class Homework {
    public static void main(String[] args) {
        byte a = 100 ;
        int b = a/2 + a++ + --a * a * 3 + 100;
        System.out.println(b);
         System.out.println(a++ );
         System.out.println(a);
         System.out.println(--a);
         int x = 3;
         int y = x++;
         System.out.println(y++ + x++ + y);
         System.out.println("======================");
         int num = 80;
         boolean x1 = num%2 == 0;
         boolean x2 = num%3 == 0;
         boolean x3 = num%5 == 0;
         System.out.println(num + "is divisable by 2:" + x1);
        System.out.println(num + "is divisable by 3:" + x2);
        System.out.println(num + "is divisable by 5:" + x3);

        String n = "10.5" + 3;
        System.out.println(n);






    }
}
