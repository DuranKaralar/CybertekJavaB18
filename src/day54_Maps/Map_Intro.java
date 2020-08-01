package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {
       // add method can add only one data
        Map<String ,Double> employeeInfo=new LinkedHashMap<>();
        employeeInfo.put("Bekir", 100000.9);
        employeeInfo.put("Duran", 100000.0);
        System.out.println(employeeInfo);

        //Repper class only dedicated to double, compiler accept 100000 without dot as  a int so that
        //it give us compile erro

        System.out.println(employeeInfo.size());


        employeeInfo.get("Bekir");
        System.out.println(employeeInfo.get("Bekir"));

        employeeInfo.remove("Bekir");

        System.out.println(employeeInfo);

        employeeInfo.put("Zarina",1000.0);
        employeeInfo.put("Zarina",1200.0);

        System.out.println(employeeInfo);

        Map<String, LocalDate> birthday= new LinkedHashMap();
        birthday.put("Bekir", LocalDate.of(1996,9,24));
        birthday.put("Duran",LocalDate.of(2000,9,24));
        birthday.put("Karalar",LocalDate.of(2000,9,24));
        birthday.put("Mehmet",LocalDate.of(1968,3,29));
        birthday.put("Fatma",LocalDate.of(1974,2,11));

        System.out.println(birthday);



    }

}
