package day12_ScannerRepeat;

import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //writes only first word
// 7921 jonesBranch Dr, Mclean VA,22034
        String fullAdress="";
        System.out.println("Enter number of the building:");
        short num=input.nextShort();
          fullAdress += num + " ";
        System.out.println("Enter your street name");
        String streetName=input.next();
        fullAdress+=streetName+" ";

        System.out.println("Enter thr type of the road:");
        String roadType=input.next();
        fullAdress += roadType+",";

        System.out.println("Enter the city name,state,zip code:");
        String cityName=input.next();
        fullAdress += cityName+" ";
        String state=input.next();
        fullAdress += state+", ";
        int zipcode=input.nextInt();
        fullAdress += zipcode;

        System.out.println("Adress is:" + fullAdress);













    }
}
