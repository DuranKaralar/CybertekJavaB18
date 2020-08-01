package day18_NestedLoop;

public class Nested_Lopp {
    public static void main(String[] args) {

        for(int i=1;i<=3;i++){

            for(int z=1;z<=2;z++ ){
                System.out.print("Hello");// hello will be printed 6 times

            }
            System.out.println();// we give empty print statement in order to break the line
            //if we dont use it the line will not be seperated
        }
        System.out.println("==========================================");
        for(int i=1;i<=7;i++){
            for(int z=1;z<=6;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        int a=1;
        while(a<=7){
            a++;
            int b=1;
            while (b<=5){
                System.out.print("#");
                b++;
            }
            System.out.println();
        }





    }
}
