package day35_Static;

public class staticMethods {
    int a=100;
static int b=200;//bunu kabul eder static old icin

    public static void main(String[] args) {
      //  System.out.println(a);// compiler error because it is instance variable
        //static only accept static
        staticMethods obj1=new staticMethods();
        System.out.println(obj1.a);// seklinde cagirabiliriz sadece
        System.out.println("===================");
        System.out.println(b);
        System.out.println(staticMethods.b);
        System.out.println(obj1.b);// prefers to be called through class name



    }

    public void method(){
        System.out.println(a);// static olm icin kabul eder
        System.out.println(b);
    }

}
