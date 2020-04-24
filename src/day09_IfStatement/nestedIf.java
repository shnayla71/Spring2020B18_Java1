package day09_IfStatement;

public class nestedIf {
    public static void main(String[] args) {
        boolean UScitizen=true;
        int age=17;
        if(UScitizen) {
            if (age > 17) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }
        }else{System.out.println("you must be citizen");}
System.out.println("============================");
       int score=98;
       String grade="";
       if(score>=0 && score<=100){
           if(score>=90){grade="A";}
            else if(score>=80){grade="B";}
            else if(score>=70){grade="C";}
            else if(score>=60){grade="D";}
            else if(score<60){grade="F";}}
       else{grade=" invailid";}
       System.out.println(grade);

       int score2=75;
       String grade2="";
       if(score2>=0 && score2<=100)
       { grade2=(score2>=90)? "A":(score2>=80)? "B":
               (score2>=70)? "C": (score2>=60)? "D":
                       "F";
       }else{grade2="invailid";}
System.out.println(grade2);


























       }



























    }

