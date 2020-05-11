package day37_Constructors;

public class ConstructorIntro {

    public ConstructorIntro(int a){ //must be same with classname
        System.out.println("Constructor with parameter of int "+ a);
    }

    public static void main(String[] args) {
    //    ConstructorIntro obj1=new ConstructorIntro(); object must be created with existing constructor

   ConstructorIntro obj2=new ConstructorIntro(10);// kabul ediyor yukarda tanimladigi int icin

   ConstructorIntro obj3=new ConstructorIntro(20);



    }
}
