package officeHours;
import java.util.Scanner;
public class mail_replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your email");
        String email = scan.next();

        String domain="@gmail.com";
        String name=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String lastname=email.substring(0,email.indexOf("_"));
        if(email.contains("_")){
            System.out.println(name+"_"+lastname +domain);}

        else {
        System.out.println(email);}


    }
    }

