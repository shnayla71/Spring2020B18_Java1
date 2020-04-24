package day07_IfStatement;

public class voteAge {
    public static void main(String[] args) {
        int age = 18;
        boolean citizen = true;

        boolean eligible = age >= 18 && citizen== true;
        if (eligible) {System.out.println(" you are eligible to vote");}
        if (!eligible){System.out.println(" you are not eligible to vote");}
        // eligible == false










    }
}
