package Saim_Class;

public class person {
    private String name;
    private int age;


    public person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class test1{
    public static void main(String[] args) {
       person p1=new person("harika",35);
       p1.setAge(37);
       p1.setName("ayla");
        System.out.println(p1);
    }
}