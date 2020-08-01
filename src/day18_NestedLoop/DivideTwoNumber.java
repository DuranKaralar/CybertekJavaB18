package day18_NestedLoop;
/*
1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
 */
public class DivideTwoNumber {
    public static void main(String[] args) {

        int a=10;
        int b=3;

        if(b==0){
            System.out.println("divisor cannnot be zero");
            System.exit(0);
        }

        int count=0;
        while (a>=b){//count the execution of the loop
            a -=b;
            count++;
        }

       // System.out.println(count);
       // System.out.println(a);
        if(a==0){
            System.out.println("The result is: "+count);
        }else{
            System.out.println("The result is "+count+" with a remainder of "+a);
        }







    }
}
