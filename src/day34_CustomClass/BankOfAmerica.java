package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        /*
        create a class called testers
        attributes:
        name, employeeID, JobTitle, Salary

        Actions:
        setTestersInfo,
         */

    Tester tester1=new Tester();

    tester1.setTesterInfo("Bekir ",121394213l,"QA Tester",110000);

    Tester tester2=new Tester();
    tester2.setTesterInfo("Vanera",234124214l, "Senior SDET Tester",90000);

    Tester tester3=new Tester();
    tester3.setTesterInfo("Sha Rejepov",128349834,"SDET",125000);
    //System.out.println(tester1);
        Tester tester4=new Tester();
        tester4.setTesterInfo("Mehmet",239412213,"Manuel Tester",100000);

        Tester tester5= new Tester();
        tester5.setTesterInfo("John",1234812234,"Uber Driver",80000);

        ArrayList<Tester> testers=new ArrayList<>(Arrays.asList(tester1,tester2,tester3
        ,tester4,tester5));

        testers.removeIf(p-> !p.jobTitle.contains("SDET"));

        for(Tester each :testers){
            System.out.println(each);
        }

        double  budget=0;
        for(Tester each2 :testers){
           budget += each2.salary;
        }
        System.out.println(budget);







    }


}
