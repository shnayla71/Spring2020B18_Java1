package day10_Switch_Scanner;

public class warmupTask {
    public static void main(String[] args) {
        byte num=2;
        String result="";
        if(num>=1 && num<=7){
            result=(num==1)? "monday":
             (num==2)? "tuesday":
             (num==3)? "wednesday":
             (num==4)? "thursday":
             (num==5)? "friday":
             (num==6)? "saturday": "sunday";}else{result= "invailid";}
              System.out.println(result);













    }

}
