package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1="Cat";// String Pool
        String str2=new String("Cat");// Java Heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);// two different object, false

        String str3="Cat";// String pool

        System.out.println(str1==str3);//true

        String str4=new String("Cat");

        System.out.println(str2==str4);// they are not equel because they are two different independet object
         // String pool do not accept double indicate in pool

        String s1="Java";// String Pool, immutable we cannot modify it

        s1="Javascript";// new object will be created in memory

        System.out.println(s1); // it prints me Javascript

        String s2="Java"; // no new object will be created in the memory

        System.out.println(s1==s2);// false because s1 represent javascript
        // s2 represent java both are located in spring pool




    }
}
