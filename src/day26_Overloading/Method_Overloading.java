package day26_Overloading;

public class Method_Overloading {
    public static void main(String[] args) {
        method(10);
        method(10.0);
    }
    public static void method(int a){
        System.out.println("original method");
    }
    public static void method(double a){// or must be double,short,....
        System.out.println("overloading method");
    }
}
