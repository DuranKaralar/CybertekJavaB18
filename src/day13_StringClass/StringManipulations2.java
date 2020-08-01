package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str ="Cybertek School is the best";

        String schoolName=str.substring(0,8);
        // ending index is not included compiler accepts 0 and 6


        System.out.println(schoolName);

        String fullname="Bekir Karalar";
                      // 012345678910
        String firstname=fullname.substring(0,5);
        String lastname=fullname.substring(6,13);
        System.out.println(firstname);
        System.out.println(lastname);
        // if we give indexis that are not more than ending index+1
        // more than last index+1 is let us get compiler error
        // fullname= firstname lastname
        //gmail lastname_firstname@gmail.com

        String Bekir ="Bekir Karalar";
        String lastname2=Bekir.substring(6,13);
        String firstname2=Bekir.substring(0,5);
        System.out.println(lastname2+"_"+firstname2+"@gmail.com");
        String gmail=lastname2.concat("_").concat(firstname2).concat("@gmail.com");
        System.out.println(gmail);

        String gmai2=Bekir.substring(6,13)+"_"+Bekir.substring(0,5)+"@gmail.com";
        System.out.println(gmai2);

        String s1="I love Java Progtamming Language";
                 //01234567
        String s2=s1.substring(7);
        System.out.println(s2);
        // we just gived the first index that is 7 and executed untill end

        String s3="I like C# Programming";
        s3=s3.replace("C#","Java");

        System.out.println(s3);


        String name="COVİD 18";
        name=name.replace("8","9");

        System.out.println(name);

        String r1="I like C#, C# is fun, C# is cool";

        System.out.println(r1);
        r1=r1.replaceFirst("C#","Java");

        System.out.println(r1);
        // replace

        String days="Tomorrow is Monday, Tomorrow is Tuesday";
        days=days.replaceFirst("Tomorrow","Today");

        System.out.println(days);

        // there is difference between replace and replace first







    }
}
