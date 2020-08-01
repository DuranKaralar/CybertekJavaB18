package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();

        System.out.println(dt);

        LocalDate date=LocalDate.of(2020,3,20);
        LocalTime time=LocalTime.of(16,4,16);

        LocalDateTime datetime=LocalDateTime.of(date,time);

        System.out.println(datetime);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd"); //if you miss a year it also miss on print line
        LocalDate date2=LocalDate.of(2019,3,20);
        System.out.println(date2.format(dtf));



    }
}
