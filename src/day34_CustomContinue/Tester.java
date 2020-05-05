package day34_CustomContinue;

public class Tester {
    String name;
    long employeeId;
    String jobTitle;
    double salary;

 public void setTesterInfo(String name,long employeeId,String jobTitle,double salary){
     this.name=name;
     this.employeeId=employeeId;
     this.jobTitle=jobTitle;
     this.salary=salary;
 }
public String toString(){
     return "Name: "+name+",job title: "+jobTitle+",employeeid: "+employeeId+",salary: "+salary;
}

}
