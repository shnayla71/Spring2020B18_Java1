package day37_Constructors;

public class Student {
    String name;
    int age;
    char gender;
   static String university="cybertek";
    public Student(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
    public void setInfo(String name,int age,char gender,String university){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
    public String toString(){
        return "name: "+name+" age: "+age+" gender: "+gender+" uni: "+
                university;
    }
}
