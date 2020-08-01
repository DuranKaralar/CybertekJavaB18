package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {

    String[] friends={"John","Aaron","Daniel"};

        LocalDate JohnBirtday =LocalDate.of(2020,3,5);
        LocalDate AaronBirthday=LocalDate.of(2000,10,12);
        LocalDate DanielBirthday =LocalDate.of(2010,5,6);

        LocalDate[] birthdays={JohnBirtday,AaronBirthday,DanielBirthday};

        for(int i=0;i<friends.length;i++){
           String name= friends[i];
           LocalDate bd=birthdays[i];
            System.out.println(name+"'s birthday is "+bd);
        }





    }


}
