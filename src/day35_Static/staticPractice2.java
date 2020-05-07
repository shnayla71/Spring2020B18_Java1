package day35_Static;

public class staticPractice2 {
    String brand;
    String model;
     static boolean hasWheels=true;

    public  void printBrand(){ //static olursa kabul etnez
        System.out.println(brand);

    }
    public  void printModel(){
        System.out.println(model);
    }

    public  void main(String[] args) { // yukarida static dedigi icin burda yazmaya biliriz
        System.out.println(hasWheels);// static old icin yazabildik buraya
    }



}
