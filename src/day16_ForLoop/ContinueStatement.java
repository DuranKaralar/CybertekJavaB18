package day16_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=1;i<=5; i++){//1,2,3,4,5,

            if(i==3){
                continue;// exit that itiration
            }
            System.out.println(""+i);



        }

        for(int i =0;i<=20;i++){
            if(i%2 != 0){
                continue;//skip all the even number
            }/*
            if(i%2==0){
                continue;// skips all the even number
            }*/
            System.out.print(i+" ");
        }








    }
}
