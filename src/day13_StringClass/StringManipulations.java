package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str="Cybertek";// it does have index number
                //  0123456
        char ch1 =str.charAt(5);//'e'
        System.out.println(ch1=='A');
        //                 't' =='A'  false
        System.out.println(ch1=='T'); // FALSE because java is case sensitive
        //                  t ==T

        int totallength=str.length();
        System.out.println(totallength);

        System.out.println(totallength>250);// false

        String str2="Today is great day, Java is fun";
        int totallength2=str.length() - 1;
        // index number starts with 0
        //length starts to count from 1. maximum
        // index starts from 0, length starts from 1

        String s1= "Cybertek";
        s1=s1.concat(" School");// " Cybertek School" after we assigned s1=
        // it becomes Bybertek School. if we do not assign it, the value will be the first one
        // reassignin is important
        System.out.println(s1);

        String s2="Java";
        s2.concat(" is a programming language");

        System.out.println(s2);
        System.out.println(s2.concat(" is a programming language"));//Java is a programming language
        s2=s2.concat(" is a programming language");
        System.out.println(s2);//Java is a programming language

        String r1="Java is fun";
        r1.concat(", and it is easy"); // when we use sout it is concat them,
        System.out.println(r1.concat(", and it is easy"));
        r1=r1.concat(", and it is easy");
        System.out.println(r1);

        String name1="CYBERTEK";
        name1 = name1.toLowerCase();// we have to assign the right one two, left part
        System.out.println(name1);

        String name2="cybertek school";
        name2=name2.toUpperCase(); // before reinnitaize the name2= it will give us a lower case
        // we will get upper cases when we initialize name2
        System.out.println(name2);

        String A1="                Today      is      a       great day       ";
        A1=A1.trim();
        System.out.println(A1); // trim works like lower and Uppercases
        // we need to initialize A1 again in order to change
        // trim removes the unused spaces
        // spaces between words are using so that they are not unused
        // unused spaces is before the first and last word
















    }
}
