package day34_CustomContinue;

public class DogObjects2 {
    public static void main(String[] args) {
        String food1=" chicken";
        String drink="milk";
        String play=" ball";
     /*   dog1.breed=" Husky";
        dog1.size="small";
        dog1.color="white";
        dog1.name="Ghost";
        dog1.age=4;*/
        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Small", 4, " white", "Ghost");

        Dog dog2 = new Dog();
        dog2.setDogInfo(" Alabay", "Extra big", 3, " brown", "Lucy");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", " miniature", 2, " black", "Nacy");

        Dog dog4=new Dog();
        dog4.setDogInfo(" kangal","big",5,"white","Tedy");
        dog2.eating(food1);
        dog1.drinking(drink);
        dog3.playing(play);
        System.out.println("============================");

        Dog[] dogpark={dog1,dog2,dog3,dog4};

        for(int i=0;i<dogpark.length;i++){
            dogpark[i].eating("chicken");
        }
        for(Dog each:dogpark){
            each.drinking("milk");
        }
        for(Dog each1:dogpark){
            each1.playing("football");
        }






    }   }