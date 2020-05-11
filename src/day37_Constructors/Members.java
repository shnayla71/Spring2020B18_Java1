package day37_Constructors;

public class Members {
    static String uniName="Cybertek";
    String name;
    int age;
    char gender;
    public Members(String name,int age,char gender){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+
                " gender: "+gender+" universty: "+ uniName;
    }
}
 class Try{
     public static void main(String[] args) {

         Members mem1 = new Members("Mike", 25, 'M');
         System.out.println(mem1);

         Members mem2=new Members("Smith",28,'M');
         System.out.println(mem2);

         Members mem3=new Members("Mary",32,'F');
         System.out.println(mem3);

     }
}