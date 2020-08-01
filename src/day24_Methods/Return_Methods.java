package day24_Methods;

public class Return_Methods {

    public static void MaxNum(int a,int b){
        if(a >= b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        int result=Addition(1000,2000);
        System.out.println(result);

        int result2=result+200;
        System.out.println(result2);
        MaxNum(10,20);
    }

    public static int Addition(int a, int b){

        return a+b;
        //   System.out.println("Hello");
    }

}
