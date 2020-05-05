package day30_ArrayListContinue;
import java.util.Scanner;
import java.util.ArrayList;
public class calis {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11
        String result = "";
        for (int i = num1; i <= num2; i++) {
            if (num2 > num1) {
                result += " " + i;
                i++;
            }

        }
        System.out.println(result);



    }


}


