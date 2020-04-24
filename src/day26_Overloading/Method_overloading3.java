package day26_Overloading;

public class Method_overloading3 {
    public static void main(String[] args) {
        sum(10, 20);
        sum((int)40l,(int)50l);// sayilar long olursa explicting casting
        double num = sum(5.4, 7.6);
        System.out.println(num);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static double sum(double a, double b) {
        return (a + b);
    }

}