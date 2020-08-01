package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {
        LocalDateTime time1=LocalDateTime.of(2015,12,25,21,30,45);

        // Tue 12/25/2015 11:30 am

        DateTimeFormatter format=DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm, a");
        System.out.println(time1.format(format));


    }

}
