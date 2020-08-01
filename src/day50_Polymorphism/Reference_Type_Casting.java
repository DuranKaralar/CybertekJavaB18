package day50_Polymorphism;

public class Reference_Type_Casting {

    public static void main(String[] args) {


        int a = 100;
        double b = a;   // casting is implicitly done : smaller type always assign larger one

    /*
    upcasting: casting from subcass to superclass
    casting the reference of   basically we are upgrading it
     */

        Dog dog=new Dog("a","b",2);
        Animal anima1=(Animal) dog;   // upcasting there ISA relation so that we assigned it.
        //it is done implicitly

        Cat cat=new Cat("1","2",3);
        Animal animal2=(Animal) cat; //  we can cast it  and the first pre condition is there must be is a relation
        System.out.println("============================");
        /*
        downcasting it is casting from a superclass type to subclass type
         */

        double c=10;
        int d=(int)c;

        Animal animal3=new Dog("A","D",1);
        Dog dog3=(Dog)animal3;

        Animal animal4=new Cat("1","2",3);
        Cat cat2=(Cat)animal4;

        System.out.println("=====================");
        //benefit reference type decides what can be accesible
        /*
        dog class have Bark and dogName variable
         */

        Animal animal5=new Dog("Lucy","M",3);
        /*
       We can call only the objects of Animal when we use polymorphism reference type decides what is accessible,
         */

        Dog dog2=(Dog) animal5;
        dog2.bark();

        ( (Dog)animal5).bark(); // this is the second way of calling instances of class we need printizes ()

        /*
        we will see it when we have screenshot amd
         */

    }
}