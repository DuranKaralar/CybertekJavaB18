package day27_DateTime;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2000,9,15);
        System.out.println(date1);

        LocalDate birthdate=LocalDate.of(1996,9,21);
        System.out.println("My birthdays is on "+birthdate);


        LocalDate februart=LocalDate.of(1996,2,19);
        System.out.println(februart);

        boolean result1 =date1.isAfter(birthdate);
        System.out.println(result1);

        boolean result2=birthdate.isBefore(date1); //true
        System.out.println(true);

        boolean result3=birthdate.isEqual(date1); //false
        System.out.println(result3);

        //is leapyear();
        boolean result4=birthdate.isLeapYear();
        System.out.println(result4);


        System.out.println("=====================================================");
        LocalDate now=LocalDate.now();
        System.out.println("Today is "+now);

        LocalDate birtday_Bekir=LocalDate.of(1996,9,14);

        int months=birtday_Bekir.getMonthValue();

        String str=now.toString();
        System.out.println(str.replace("-"," "));




    }


}
