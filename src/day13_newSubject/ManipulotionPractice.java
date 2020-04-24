package day13_newSubject;
import java.util.Scanner;
public class ManipulotionPractice {
   /* input =cyBerTek sChooL
    output=Cybertek
           School
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your fullname:");
        String fullname=scan.nextLine();

        String firstname=fullname.substring(0,fullname.indexOf(" "));
        String lastname=fullname.substring(fullname.indexOf(" ")+1);
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();


        System.out.println("Your firstname: "+firstname);
        System.out.println("Your lastname: "+lastname);






















    }
}
