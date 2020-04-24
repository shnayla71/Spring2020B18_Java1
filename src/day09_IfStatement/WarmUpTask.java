package day09_IfStatement;

public class WarmUpTask {
    public static void main(String[] args) {
        int age=80;
        String result="";
    if(age<3 && age>0){result="baby";}
    else if(age>=3 && age<=5){result="toddler";}
    else if(age>=6 && age<=9){result="kids";}
    else if(age>=10 && age<=12){result="pre-teen";}
    else if(age>=13 && age<=17){result="teenager";}
    else if(age>=18 && age<=20){result="young adult";}
    else if(age>=21 && age<=39){result="adult";}
    else if(age>=40 && age<=49){result="young middle aged-adult";}
    else if(age>=50 && age<=54){result="aged-adult";}
    else if(age>=55 && age<=64){result="young senior citizen";}
    else if(age>=65 && age<=74){result="moddle senior citizen";}
    else if(age>=75 && age<=84){result="senior citizen";}
    else if(age>=85 && age<=120){result="old senior citizen";}
    else {result="invailid entry";}
System.out.println(result);
boolean eligibleToBuy= result=="adult" || result=="young middle aged-adult"
                      || result=="aged adult";
if(eligibleToBuy){System.out.println("you are eligible");}
else{System.out.println("you are not eligible");}



    }
}
