package day45_Exceptions;

class BreakTimeException extends RuntimeException{//it is custom unchecked excepiton

    public BreakTimeException(){
    super("It's break time, we should take break ");

   }

   public BreakTimeException(String str){

   }

}




public class CustomException {

    public static void main(String[] args) {

        boolean breakTime=true;
        if(breakTime){
            throw new BreakTimeException( "Let's have a break please");
        }else{
            System.out.println("Continue the class");
        }

       // throw new RuntimeException("It's break time, we should take break");



    }


}
