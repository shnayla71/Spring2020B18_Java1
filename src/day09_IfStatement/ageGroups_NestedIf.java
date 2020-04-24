package day09_IfStatement;

public class ageGroups_NestedIf {
    public static void main(String[] args) {
        int age=49;
        String group="";
        if(age>=0 && age<150){
            group=(age<21)? "teenager": (age>=21 && age<=55)? "Adult":"senior";



        }else{ group="NOT INVAILID";}
        System.out.println(group);

























    }
}
