package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyword {

    public static void main(String[] args)  {

       NoSuchElementException obj = new NoSuchElementException();

      // throw obj;

       // throw new NoSuchElementException();
       /*
      boolean breakTime = true;
      if(breakTime){
          throw new RuntimeException("It's break time");
      }
     */
       //throw new IOException(); it used for
      /*
     try {
        throw new IOException();
     }catch (Exception E){

     }

     */

      int[] arr={5,6,7};
     //   System.out.println(arr[100]);
       // System.out.println(9/0);
        try {
            throw new RuntimeException();
        }catch (Exception e){
            
        }



    }


}
