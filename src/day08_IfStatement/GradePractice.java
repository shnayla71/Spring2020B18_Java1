package day08_IfStatement;

public class GradePractice {
    public static void main(String[] args) {
        double g = 60;
        char sc=' '; //String sc= " ";
        if(100>= g && g >= 90){ sc= 'A';}
        else if(90>g && g>=80){ sc= 'B';}
        else if(80>g && g>=70){ sc='C';}
        else if(70>g && g>=60){ sc= 'D';}
        else { sc='F';}
        System.out.println(sc);










    }
}
