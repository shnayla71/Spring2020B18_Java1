package officeHours;

import java.util.Scanner;

public class number_ascending {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();

        String result1=" ";
        if(n2>n1 && n1<n3 && n2<n3){
            result1=n1 +","+n2+","+n3;
        }else if(n1>n2 && n3>n2 && n1>n3){
            result1=n2+","+n3+","+n1;
        }else if(n1>n3 && n2>n3 && n1>n2) {
            result1 = n3 + "," + n1 + "," + n2;
        }else if(n2>n1 && n1<n3 && n2>n3) {
            result1 = n1 + "," + n3 + "," + n2;
        }else if(n1>n2 && n3>n2 && n1<n3) {
            result1 = n2 + "," + n1 + "," + n3;
        }else if(1>n3 && n2>n3 && n1<n2) {
            result1 = n3 + "," + n2 + "," + n1;}
        else {
            result1 = "invalid number";
        }
         System.out.println(result1);





    }
}
