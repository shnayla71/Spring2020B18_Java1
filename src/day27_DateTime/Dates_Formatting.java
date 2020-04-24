package day27_DateTime;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date1=LocalDate.now();             //  ""MM/dd/yyyy"yazilabilir
        System.out.println(date1.format(dtf));// if use MMM writes month's three letters

       DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yy");
       LocalDate date2=LocalDate.of(1999,12,25);
       String str1=date2.format(dtf2);
        System.out.println(str1);



    }
}
