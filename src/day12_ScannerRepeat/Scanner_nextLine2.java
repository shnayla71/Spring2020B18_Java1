package day12_ScannerRepeat;

import java.util.Scanner;

public class Scanner_nextLine2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // fulladress=building num street,city,state,zipcode
        System.out.println("building Number:");
        int num=input.nextInt();
        System.out.println("building number: "+num);
        input.nextLine();
        System.out.println("Street:");
        String street=input.nextLine();
        System.out.println("street is: "+street);

        System.out.println("Enter the zipcode:" );
        int code=input.nextInt();
        input.nextLine();

        System.out.println("Enter the city and state / :");
        String cityState=input.nextLine();

        String fullAdress=num +" "+street+","+ cityState+" "+ code ;
       System.out.println(fullAdress);
input.close();// closes the scanner we can'' use input again
        














    }
}
