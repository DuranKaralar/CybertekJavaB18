package day42_Inheritance;

public class TestData extends Data {
    /*
    except private all of them visible. Private is visible only for same class
    public default and protected is visible
     */
    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);

      //  System.out.println(TestData.privateData);
        //it give us compile error because never will be visible outside the class

    }

}
