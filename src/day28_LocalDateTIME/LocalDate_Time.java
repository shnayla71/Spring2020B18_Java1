package day28_LocalDateTIME;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class LocalDate_Time {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt); //saat dakika tarih veriyor

        //2020-03-20 11:25:30
        LocalDate dt2=LocalDate.of(2020,3,20);
        LocalTime time=LocalTime.of(11,25,30);
        LocalDateTime dateTime=LocalDateTime.of(dt2,time);
        System.out.println(dateTime);

        LocalDateTime dateTime2=LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(dateTime2);

    }

}
