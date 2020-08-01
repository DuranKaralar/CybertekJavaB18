package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str="Cybertek";

        try{
            System.out.println(str.charAt(100));
        }catch (Exception e){
           String discription= e.getMessage();
            System.out.println(discription);
        }

        System.out.println("Completed");

        System.out.println("=====================");

        String result="";

        try {
            System.out.println(100/0);
            System.out.println("Try block");
        }catch (Exception e){
            System.out.println("Catch Block");
        /*
           String description= e.getMessage();
         */
        result= e.getMessage();


        }

        System.out.println(result);


        System.out.println("Completed");





    }

}
