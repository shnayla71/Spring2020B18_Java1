package day35_Static;

public class StudentObject {
    public static void main(String[] args) {
        student student1=new student();
        student1.name="Muhtar";
        System.out.println(student1);

        student student2=new student();
        student2.name="Kuzzat";
        System.out.println(student2);

        student.printSchool();


    }
}
