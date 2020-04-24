package officeHours;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your product price: ");
        double price=scan.nextDouble();

        System.out.println("enter discount number: ");
        double discount=scan.nextDouble();

        double revenue=(price*discount)/100;
        double realprice=price-revenue;
        double newprice=realprice-(realprice*10/100);
        String result=(realprice > 5000)?
             "your price: "+ newprice:
         "your price: " + realprice;
        System.out.println(result);












    }
}
