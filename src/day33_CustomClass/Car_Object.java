package day33_CustomClass;

public class Car_Object {
    public static void main(String[] args) {
         Car car1=new Car();
         car1.brand="BMW";
         car1.model="X5";
         car1.year=2020;
         car1.color="Red";



        System.out.println(car1.brand); // null
        System.out.println(car1.model); //null

        System.out.println(car1.model);
        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.year);

        car1.start();
        car1.drive();
        System.out.println("=====================");

        Car car2=new Car();
         car2.brand="Toyota";
         car2.model="Corolla";
         car2.year=2020;
         car2.color="white";

        System.out.println(car2.model);
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.year);

        car2.start();
        car2.drive();
        car2.getInfo();
        Car[] cars={car1,car2};
        cars[0].drive();
        cars[1].start();

    }
}
