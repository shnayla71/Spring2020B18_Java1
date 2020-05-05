package day34_CustomContinue;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;
public void eating(String food){
    System.out.println(name+ " is eating "+food);
}
public void drinking(String drink){
    System.out.println(name+" is drinking "+drink);
}
public void playing(String play){
    System.out.println(name+" is playing "+play);
}
public void setDogInfo(String breed,String size,int age,String color,String name) {
    this.breed = breed;
    this.size = size;
    this.age = age;
    this.color = color;
    this.name = name;
}

public String toString(){
    return "Dog Name: "+name+
            "\nDog size: "+size+
            "\nDog age: "+age+
            "\nDog color: "+color+
            "\nDog breed: "+breed;
}





}