package day33_CustomClass;
import java.util.Scanner;
public class assigment {


        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String s = inp.nextLine();
            //write your code below
             String result="";
            for(int i=0;i<s.length();i++) {
                result = s.substring(i, i + 1).toLowerCase();

                System.out.print(result);
            }
        }
    }

