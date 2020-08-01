package day42_Inheritance;

public class TestData_2 extends Accessmodifiers {
/*
publicVariable
protectedVariable
 */
    public static void main(String[] args) {
        System.out.println(TestData_2.publicVariable);
        System.out.println(TestData_2.protectedVariable);
        System.out.println(TestData_2.defaultVariable);


        TestData_2.publicMethod();
        TestData_2.protectedMethod();
        TestData_2.defaultMethod();




    }

}
