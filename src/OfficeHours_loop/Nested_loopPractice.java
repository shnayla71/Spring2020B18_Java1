package OfficeHours_loop;

public class Nested_loopPractice {
    public static void main(String[] args) {

        int l=1;
        while(l<=5){
            for(int i=10;i<=50;i+=10){
                System.out.print(i+" ");
            }System.out.println();


            l++;
        }

        System.out.println("=========================");

        int m=1;
        while(m<=8){
            for(int k=1;k<=6;k++){
                System.out.print("* ");
            }System.out.println();
            m++;
        }










    }
}
