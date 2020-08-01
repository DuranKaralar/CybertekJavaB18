package Practice_04_22_2020;

public class return_Statement {
    public static void main(String[] args) {
      /*  if(10>9) {
            return;//return only affects that specific current method of its own method not the one that we used it
        }*/
      method1();
        System.out.println("Hello Batch 18");

    }
    public static void method1(){
        if(10>9){
           // return; // it only exits method1, if return type is not void return must return value
            // if we used it in void return type it exist the its own method
       //     System.exit(0);// it exits entire program there is a differences between return and Sytem.exit
            // we can not use break and continue statements ;
        }
        System.out.println("Hello Cybertek"); // return method affects here not other places
    }


}
