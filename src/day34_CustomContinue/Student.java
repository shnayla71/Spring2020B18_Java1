package day34_CustomContinue;

public class Student {
    String name;
    String nationalty;
    int age;
    double gpa;
    char gender;
    boolean married;
public void setInfoStudent(String name,String nationalty,int age,double gpa,char gender,boolean married){
    this.name=name;
    this.nationalty=nationalty;
    this.age=age;
    this.gpa=gpa;
    this.gender=gender;
    this.married=married;
}
public String toString(){
    return "Name: "+name+",gender: "+gender+
            ",nationalty: "+nationalty+",age: "
            +age+",married: "+married;
}

}
