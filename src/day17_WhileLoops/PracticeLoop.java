package day17_WhileLoops;

import java.util.Scanner;

public class PracticeLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str= "I likeJava";
        String reverse=""; // store the reversed version of str
        int lastindex=str.length()-1; // last index number

        while(0<=lastindex){

            //str.charAt(lastindex);
            reverse +=""+str.charAt(lastindex);
            lastindex--;
        }
        boolean palindrame=reverse.equals(str);
        System.out.println(palindrame);







    }
}
