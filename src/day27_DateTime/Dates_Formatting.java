package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd_MM_yyyy");
        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));
        /*
        MM number
        MMM shortest
         */

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE MMM/dd/yyyy");
        LocalDate date2=LocalDate.of(1999,12,18);

        String str1=date2.format(dtf2);
        System.out.println(str1);
         
        LocalDate date3=LocalDate.now();
        System.out.println(date3.format(dtf2));



    }


}
