package day37_Constructors;

public class staticReviews {
    static int a;
    int b;
    static String name="John";
          String id="123";
    public static void main(String[] args) {
        staticReviews obj1=new staticReviews();
             obj1.a=20;
             obj1.b=10;
        staticReviews obj2=new staticReviews();
             obj2.a=30;  // artik iki deger icin de 30 yazar
             obj2.b=20; //kendi degerini yazar

        System.out.println(name);
        // System.out.println(id+1); static only accept static direk burdan cagiramayiz

       // static{
       //     b=75;
        //}








    }
}
