package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {


        /*
        odd number beween 1-100 in a single line separeted by space
         */
        String result="";
        for(int odd=1;odd<=100;odd+=2){// for single line user print
            result +=odd+" ";
            //System.out.println(odd+" ");
        }
        System.out.println(result);
        String evenResult=" "; // first even number is 2

        for(int even=2;even<=100;even+=2){
            evenResult +=even+" ";
        }
        System.out.println(evenResult);




    }
}
