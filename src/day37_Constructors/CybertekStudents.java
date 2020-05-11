package day37_Constructors;

public class CybertekStudents {
    static String schoolName="Cybertek";
    String studentName;
    int groupNumber;
    static String batch="18";

    public CybertekStudents(String studentName,int groupNumber){
     //   schoolName="Cybertek"; we can do like this
        this.studentName=studentName;
        this.groupNumber=groupNumber;
    }

    public String toString(){
        return "Name: "+studentName+", batch: "+batch+ ",in group: "+
                groupNumber+", School name: "+schoolName;
    }
}
class Cobjects{
    public static void main(String[] args) {
        CybertekStudents student1=new CybertekStudents("ayse",8);
        System.out.println(student1);
          student1.schoolName="MIT";// butun okul isimleri degisir
        CybertekStudents student2=new CybertekStudents("sarah",20);
        System.out.println(student2);
    }
}