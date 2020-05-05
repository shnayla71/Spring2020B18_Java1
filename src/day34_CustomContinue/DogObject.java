package day34_CustomContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1=new Dog();
     /*   dog1.breed=" Husky";
        dog1.size="small";
        dog1.color="white";
        dog1.name="Ghost";
        dog1.age=4;*/
      dog1.setDogInfo("Husky","Small",4," white","Ghost");

      Dog dog2=new Dog();
      dog2.setDogInfo(" Alabay","Extra big",3," brown"," Lucy");

      Dog dog3=new Dog();
      dog3.setDogInfo("Poodle"," miniature",2," black","Nacy");

        System.out.println(dog3);

        ArrayList<Dog> pupies=new ArrayList<>();
        pupies.addAll(Arrays.asList(dog1,dog2,dog3));

        for(int i=0;i<pupies.size();i++){
            Dog eachdog=pupies.get(i);
            System.out.println(eachdog+" ");
        }
       // older than 2 years old
         pupies.removeIf(p-> p.age>2);
        for(int i=0;i<pupies.size();i++){
            Dog eachdog=pupies.get(i);
            System.out.println(eachdog+" ");
        }


     /*   System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);*/
    }
}
