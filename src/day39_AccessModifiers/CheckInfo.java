package day39_AccessModifiers;

import javax.jws.soap.SOAPBinding;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name: "+PersonalInfo.name);

        System.out.println("Gender :"+PersonalInfo.gender);


        System.out.println("Grade : "+PersonalInfo.age);

        PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.name);// because there is only one copy of static variables


    }


}
