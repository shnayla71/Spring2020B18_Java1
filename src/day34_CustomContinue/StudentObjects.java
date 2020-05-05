package day34_CustomContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student S1=new Student();
        S1.setInfoStudent("Ayla","turkish ",37,2.5,'f',true);

        Student S2=new Student();
        S2.setInfoStudent("Reem","Arabic",38,4,'f',false);

        Student S3=new Student();
        S3.setInfoStudent("Adam","England",34,3.5,'m',true);

        Student S4=new Student();
        S4.setInfoStudent("Mike","German",30,3.0,'m',false);

        Student[] students={S1,S2,S3,S4};

        ArrayList<Student> canGraduate=new ArrayList<>(Arrays.asList(students));
        canGraduate.removeIf(p->p.gpa<=3.0);

        System.out.println(canGraduate.size());

        for(int i=0;i<canGraduate.size();i++){
            Student each=canGraduate.get(i);
            System.out.println(each.name+" can graduate");
        }
        System.out.println("=======================");

        ArrayList<Student> canNotgraduate=new ArrayList<>(Arrays.asList(students));
        canNotgraduate.removeIf(p->p.gpa>3.0);

        for(Student each:canNotgraduate){
            System.out.println(each.name+" can not graduate");
        }

    }
}
