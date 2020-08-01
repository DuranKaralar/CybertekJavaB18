package day35_Static;

public class staticMethods {
    int a=100;
    static int b=50;

    public static void main(String[] args) {
       // System.out.println(a); // static only static accepts

        staticMethods obj=new staticMethods();
        System.out.println(obj.a);

        System.out.println("=========================");

        System.out.println(b);
        /*
        while we are using static variable in static method we can use it without calling it
        such as obj.a
        giving b is enough
         */
     System.out.println(staticMethods.b);
       System.out.println(obj.b); // prefers to be called through class name


    }

    public void method(){
        System.out.println(a);
        System.out.println(b);
    }




}
