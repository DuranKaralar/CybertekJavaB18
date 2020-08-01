package day44_Exceptions;

public class try_catchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try{
            Thread.sleep(15000); // 15 seconds later world will be executed
            System.out.println("Try block");
        }catch (Exception e){
            System.out.println("Catch Block");
        }

        System.out.println("World");




    }

}
