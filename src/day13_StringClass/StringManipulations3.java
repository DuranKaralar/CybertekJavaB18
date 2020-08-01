package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str="I like Java programming John";
        int num1 =str.indexOf("John"); // it returns the index number as a int
        // because pf this we assign it to
        // İT returns the very first J .matching first character
        // if there is similar character we can use the vocabulary in order to figure out index number

        System.out.println(num1);

        String str2="Cybertek school is awesome ";
         int num2=str2.indexOf("s");//9
         int num3=str2.indexOf("is")+1;//it returns us the index number of İ
        // HOW CAN WE WİLL GET THE INDEX NUMBER OF S WE NEED TO ADD 1
        System.out.println(num2);
        System.out.println(num3);

        int maxIndexnumber ="Cybertek".length()-1;// total number of the character -1
        // it will return us 8 but it should be -1 so that it is 7
        // if index number returns us negative number it means it is not existing
        // if it is -1 it means it dosnt exist but also it ddoesnt mean that it must be only -1

        String names="Muhtar";
      int a1=  names.indexOf("Good Guy");
        System.out.println(a1);

        String fullname="Bekir Karalar";
        String firstname=fullname.substring(0, fullname.indexOf(" "));
        String lastname=fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstname);
        System.out.println(lastname);








    }
}
