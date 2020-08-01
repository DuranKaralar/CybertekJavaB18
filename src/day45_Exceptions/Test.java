package day45_Exceptions;


    class A{
        public A(){
            System.out.println("A");
        }
    }

    class B extends A{
        public  B(){
            System.out.println("B");
           // super();
        }
    }

    public class Test {
        public Test(){
            System.out.println("C");

        }

    }



