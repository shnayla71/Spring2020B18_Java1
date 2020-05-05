package day33_CustomClass;

public class Car {
       String brand;
       String model;
       int year;
       String color;
public void start(){
    System.out.println(brand+" is starting");
}
public void drive(){
    System.out.println(brand+" "+model+" is driving");
}
public void getInfo(){
    System.out.println(year+" "+brand+" "+model+" "+color);
}
public void setCarInfo(String carbrand,String carModel,int caryear,String carColor){

    brand=carbrand;
    model=carModel;
    year=caryear;
    color=carColor;
}


    public static void main(String[] args) {

    }
}
