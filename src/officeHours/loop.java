package officeHours;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-9999999;

        for(int i=1;i<=5;i++){
            System.out.println("Enter a word");
            String word=input.next();
            int num=word.length();

           if(num>max){
               max=num;
           }

        System.out.println(max);}
    }
}
