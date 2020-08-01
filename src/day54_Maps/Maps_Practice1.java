package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_Practice1 {

    public static void main(String[] args) {

        Map<String, LocalDate> birthday= new LinkedHashMap();
        birthday.put("Bekir", LocalDate.of(1996,9,24));
        birthday.put("Duran",LocalDate.of(2000,9,24));
        birthday.put("Karalar",LocalDate.of(2000,9,24));
        birthday.put("Mehmet",LocalDate.of(1968,3,29));
        birthday.put("Fatma",LocalDate.of(1974,2,11));


        birthday.put("Karalar",LocalDate.of(1999,9,9));

        birthday.remove("Karalar");

        System.out.println(birthday);

        System.out.println(birthday.get("Mehmet"));

        boolean result=birthday.containsKey("Muhtar");
        System.out.println(result);

        boolean resul2=birthday.containsValue(LocalDate.of(1996,9,24));


       // birthday.clear(); // clears everything







    }

}
