package day09_IfStatement;

public class ternary2 {
    public static void main(String[] args) {
        String result = "";
        if(9>10){result="9 is greater";}
        else { result="10 is greater";}
        String result2=(9>10)? "9 is greater"
                : "10 is greater";
        System.out.println(result);
        System.out.println(result2);
        System.out.println("==================");

        int age=20;
        boolean eligibilty =(age>=21)? true : false;
/*        if (age>=21){ eligibilty= true;}
           else{eligibilty= false;}*/
         System.out.println(eligibilty);
         System.out.println("=================");

         int ageOfPerson=18;
         String eligibleToVote="";
         String vote2=(ageOfPerson>=18)? "yes" : "no";
                   System.out.println(vote2);











    }
}
