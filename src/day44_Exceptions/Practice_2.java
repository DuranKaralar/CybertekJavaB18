package day44_Exceptions;

public class Practice_2 {

    public static void main(String[] args) {
        System.out.println("Java");
         waits(5);
        System.out.println("Cybertek");

    }


    public static void waits(int seconds){

        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            
        }
    }







}
