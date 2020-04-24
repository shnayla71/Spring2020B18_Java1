package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 20;
            x += 10; // x = x + 10= 30
        String schoolname = "cybertek";
          schoolname += 23456;
         System.out.println(schoolname);// cybertek23456
        System.out.println( 'a' + 'b'); // 195
        char ch1 = 'a';
             ch1 += 'b'; // character
        System.out.println(ch1);

        int num = 'z';
            num += 'x';
         System.out.println(num);// 242
        int A = 100;
           A-= 90 ; // 10
        int B = 200;
            B -= A; // 190
        System.out.println(B);
        int a = 2;
        a *= 3;// 6
        int b = a *= 10;
        System.out.println(b);// a = a * 10 = 60

int a1 = 100;
int b1 =  (a1 *= 2) + ++a1;// must be ()
System.out.println(b1);// turns 401

    int q= 20;
    int p= q*=20*3;//first q*60
        System.out.println(p);
        int n = 400;
        n %= 3*5; // n= n % 15 first right
        System.out.println(n);// 10




    }
}
