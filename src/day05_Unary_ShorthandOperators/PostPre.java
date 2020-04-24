package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
        // for pre
        int a = 100;
        System.out.println(++a);// 101
        System.out.println(a);// 101

        int b= 100;
        System.out.println(--b);//99
       // for post
        int c = 200;
        System.out.println(c++);// 200
        System.out.println(c);// 201
        int B = 200;
        System.out.println(B--);//200
        System.out.println(B);//199
        // post and pre example
         int x = 10;
         int y = ++x; // 11
        System.out.println(y);//11
        System.out.println(x);//11
         int s = 10;
         int f = s++;
         System.out.println(f);// 10
        System.out.println(s);//11

        double t1 = 3.5;
        double t2 = t1--;//3.5
        System.out.println(t2);// 3.5
        System.out.println(t1);// 2.5


        int e = 25;
        System.out.println(e++);// 25
        System.out.println(e--);// 26
        System.out.println(e);//25
         int r = 50;



















    }
}
