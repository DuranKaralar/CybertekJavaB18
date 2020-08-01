package day44_Exceptions;

public class Finally_Block {

    public static void main(String[] args) {

        try {
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch (Exception e){
            System.out.println("Catch Block");
        }finally {
            System.out.println("Finally Block");
        }

        // finally block is always executed, it doesnt care, if try and catch blocks are handiling with exceptions

     // try catch and finally is the order ,it giv
 // try needs to be with catch we shouldt make try and finally ,it must be try catch and finally

    }

}
