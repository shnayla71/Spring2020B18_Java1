package day16_forLoop;

public class continuePractice {
    public static void main(String[] args) {
        for(char i='Z';i>= 'A';i--){
            if(i=='Y'|| i=='H'||i=='J'||i=='D'){
                continue;//skip these character
            }

            System.out.print(i+" ");}
System.out.println();
    for(int i=1;i<=100;i++){
        if(i%3==0 || i%5==0){continue;}
        // if we use && it skip 15,45,90 only
        System.out.print(i+" ");
    }











    }
}
