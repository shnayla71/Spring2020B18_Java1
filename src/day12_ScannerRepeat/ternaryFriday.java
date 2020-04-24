package day12_ScannerRepeat;

import java.util.Scanner;

public class ternaryFriday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER your statu:");
        int status = scan.nextInt();
        String result = "";
        if (status == 200) {
            result = "ok";
        } else if (status == 201) {
            result = "created";
        } else {
            result = "invalid status";
        }
        System.out.println(result);

        String result1=(status==200)? "ok":(status==201)? "created":"invalid status";
        System.out.println(result1);
















    }
}
