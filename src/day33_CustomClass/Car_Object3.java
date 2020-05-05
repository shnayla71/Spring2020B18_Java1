package day33_CustomClass;

public class Car_Object3 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.brand="BMW";
        car1.model="X5";
        car1.year=2020;
        car1.color="Red";

        Car car2=new Car();
        car2.brand="Toyota";
        car2.model="Corolla";
        car2.year=2020;
        car2.color="white";

        Car car3=new Car();
        car3.brand="Audi";
        car3.model="Q5";
        car3.year=2020;
        car3.color="grey";

        Car car4=new Car();
        car4.setCarInfo("BMW","X6",2020,"purple");


        Car[] cars={car1,car2,car3,car4};
        for(int i=0;i<cars.length;i++){  // for(Car each:cars) seklinde yazilir
            cars[i].getInfo();
        }
    }
}
