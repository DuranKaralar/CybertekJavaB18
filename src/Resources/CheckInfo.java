package Resources;

import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println(PersonalInfo.gender);
        System.out.println(PersonalInfo.name);


        PersonalInfo obj=new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

      //      System.out.println(obj.age);

    }

}
