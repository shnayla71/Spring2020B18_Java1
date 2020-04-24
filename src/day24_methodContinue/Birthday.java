package day24_methodContinue;

public class Birthday {
    public static void Age(int birthYear){
        int current=2020;
        int age=current-birthYear;
        if(age>0 && birthYear>1900){
        System.out.println(age);
        }else{
            System.out.println("invalid");}

    }

    public static void main(String[] args) {
        int a=1983;
        Age(2031);
    }










}
