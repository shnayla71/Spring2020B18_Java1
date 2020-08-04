package day37_Constructors;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Ayla",35,'f');
      //  student1.setInfo();
student1.university="mit";
        System.out.println(student1);

        Student student2=new Student("harika",36,'f');
        System.out.println(student2);
    }
}
