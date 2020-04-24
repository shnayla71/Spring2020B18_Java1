package day21_MultiDimential;
import java.util.Arrays;
public class Email {
    public static void main(String[] args){

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
        for(String each:emails) {
            if (each.endsWith("@gmail.com")) {
                continue;
            }
            System.out.println(each);
        }







    }
}
