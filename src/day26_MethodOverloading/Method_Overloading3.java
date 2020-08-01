package day26_MethodOverloading;

public class Method_Overloading3 {
    public static void main(String[] args) {
        //first method: can find sum of two int numbers
        //second method: can find sum of two double numbers
     sum(4,6);
     sum(4,2.8);
     //double num2 = sum(4,15.8); void method doesnt return any value
       // System.out.println(num2);
        //40L, 50l
        sum((int)40L,(int)40l);
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static double sum(double a,double b){
      return a+b;
    }
}
