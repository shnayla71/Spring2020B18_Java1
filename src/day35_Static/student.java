package day35_Static;

public class student {
    String name;
    long id;
    double gpa;
 static   String SchoolName="Cybertek";

 public void setInfo(String name,long id,int gpa){
     this.name=name;
     this.id=id;
     this.gpa=gpa;
 }
 public static void printSchool(){
     System.out.println("School name is: " + SchoolName);
 }

 public String toString(){
     return "Name: "+name+",School Name: "+SchoolName;
 }


}
