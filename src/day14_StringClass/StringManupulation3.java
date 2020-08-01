package day14_StringClass;

public class StringManupulation3 {
    public static void main(String[] args) {
        String str1="CYBERTEK";
        String str2="cybertek";

        System.out.println(str2.equals(str1)); // false

        System.out.println(str1.equalsIgnoreCase(str2));
        // it is true because it ignores the case sensitivity ,
        // it just checks

        String s1="Cybertek School";// boolean
        boolean r2=s1.contains("School");
        System.out.println(r2); //
        //if str is contaned it give you true

        // every method except ignoreCaseSensitivy
        // is case sensitive in java

        String s3="United States";
        System.out.println(s3.startsWith("U")); // it is case sensitive















    }
}
