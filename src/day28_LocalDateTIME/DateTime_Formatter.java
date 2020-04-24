package day28_LocalDateTIME;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime datetime1=LocalDateTime.of(2015,12,25,11,30,25);
        System.out.println(datetime1);
        // 12/25/2015 11:30 am

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a,EEE");
        System.out.println(datetime1.format(dtf));               //can write EEE at top of sentence



    }
}
