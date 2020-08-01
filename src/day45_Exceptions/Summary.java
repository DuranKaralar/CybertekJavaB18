package day45_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Summary {

    public static void main(String[] args) {

        try {
            throw  new IOException();
        }catch (Exception e){

        }

        System.out.println("Hello");

        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException a){// we can use index out of boundsexception

        }

        System.out.println("Completed");



        try{
            throw new NullPointerException();
        }catch (ArithmeticException a){
            System.out.println("Arithmetic");
        }catch(ClassCastException a){
            System.out.println("Class Cast");
        }catch (NullPointerException a){
            System.out.println("Null Pointer");
        }catch (RuntimeException a){
            System.out.println("RunTime");
        }catch (Exception a){
            System.out.println("Exception");
        }


        System.out.println("==================");
        try {
            throw new ArithmeticException();
        }catch (NoSuchElementException e){
            System.out.println("No such Element");
        }finally {
            System.out.println("Finally block ");
        }



    }
    public  static void method1() throws Exception{
        throw new FileNotFoundException();
    }

    public static void  method2(){
        try{
            method1();
        }catch (Exception e){
            
        }
    }

    public static void method3(){
        method2();
    }

}
