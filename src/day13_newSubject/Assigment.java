package day13_newSubject;
import java.util.Scanner;
public class Assigment {
    /* input :cybertek prints only itials
              school
             output :CS
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();  // cybertek school

        String firstName = fullName.substring(0,  fullName.indexOf(" ") );
        String lastName = fullName.substring(fullName.indexOf(" ")+1    ); // School
        //cYbeRTEK
        System.out.println(firstName);
        System.out.println(lastName);
        firstName = firstName.substring(0,1).toUpperCase();

        lastName = lastName.substring(0,1).toUpperCase();

        System.out.println(firstName+lastName);












    }
}
