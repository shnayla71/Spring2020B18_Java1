package day27_DateTime;
import java.time.LocalDate;
public class Dates {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2020,10,23);
        System.out.println(date1);
        LocalDate birthday=LocalDate.of(2020,8,19);
        // isAfter(date);

        boolean result= date1.isAfter(birthday);
        System.out.println(result);

        boolean result1=date1.isBefore(birthday);
        System.out.println(result1);

    boolean result3=birthday.isLeapYear();// subat 29 olan leap year
        System.out.println(result3);
   LocalDate now=LocalDate.now();
        System.out.println("today is: "+ now);

        LocalDate birthDay=LocalDate.of(1983,8,12);

        String str=now.toString();
        System.out.println(str.replace("-"," "));

    }
}
