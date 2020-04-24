package officeHours;

import java.util.Scanner;

public class Lastcharacter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();

        String word1=word.substring(word.length()-1);
        System.out.println(word1);
    }
}
