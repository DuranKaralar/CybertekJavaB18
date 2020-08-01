package day39_AccessModifiers;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.defaultaccess);//Default
       // open to classes in package
        System.out.println(obj.publicAcess);//open to the world

    }

}
