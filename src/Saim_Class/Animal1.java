package Saim_Class;

public class Animal1 {
    String species;
}
class Dog extends Animal1 implements Jumpable{
    String breed;

    @Override
    public void jump() {
        System.out.println("jumping");
    }
}
interface Jumpable{
    void jump();
}

class test{
    public static void main(String[] args) {
        Dog dog1=new Dog();
        System.out.println(dog1.breed);
        System.out.println(dog1.species);
        System.out.println(dog1.toString());
        dog1.jump();


        Animal1 dog2=new Dog();
        Dog dog22=(Dog)dog2; //bundan sonra asagiyi dog22.breed kabul eder
      //  System.out.println(dog2.breed);  ref Animal1 old icin ref icindeki degerleri kabul eder
        System.out.println(dog2.species);
        System.out.println(dog2.toString());
       // dog2.jump();

        Object dog3=new Dog();
       // System.out.println(dog3.breed);
        //System.out.println(dog3.species);
        System.out.println(dog3.toString());
        //dog3.jump();

        Jumpable dog=new Dog();
      //  System.out.println(dog.breed);
       // System.out.println(dog.species);
        System.out.println(dog.toString());
        dog.jump();
    }
}