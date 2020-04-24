package day09_IfStatement;

public class Ternary_Practice {
    public static void main(String[] args) {
        int num=100;
        char ch=' ';
        if(num>0){ch='+';}
        else if(num<0){ch='-';}
        else{ ch='0';}
       System.out.println(ch);

        char ch2=(num>0)? '+' : (num<0)? '-' :'0';
        System.out.println(ch2);
System.out.println("=========================");

        byte score=90;
        String grade="";
        if(score>=90 && score<=100){ grade="A";}
        else if(score>=80 && score<90){ grade="B";}
        else if(score>=70 && score<80){ grade="C";}
        else if(score>=60 && score<70){ grade="D";}
        else if(score>0 && score<60){ grade="F";}
        else{grade="ïnvailid" ;}
        System.out.println(grade);

        String result=(score>=90 && score<=100)? "A":
                       (score>=80 && score<90)? "B": (score>=70 && score<80)? "C": (score>=60 && score<70)? "D": (score>0 && score<60)? "F" : "INVAILID";
        System.out.println(result);
System.out.println("==================================");













    }
}
