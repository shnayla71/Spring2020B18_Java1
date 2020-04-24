package day09_IfStatement;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary=20000;
        byte workHistory=3;
        String result="";
        if(salary>=30000){
            result=(workHistory>=2)?  "you are qualified":
                    "you are not qualified";
        System.out.println(result);}
    else{System.out.println("you must earn at least 30000");}






















    }
}
