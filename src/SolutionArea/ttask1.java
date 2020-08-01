package SolutionArea;

import java.util.*;

public class ttask1 {

    public static void main(String[] args) {
      /*
    Tasks:
 1. write a program that can remove the duplicated characters from String and store them into variable
 2. write a program that can identify if two strings are build out of the same letters
 		ex:
 			str1 = "abababa";  //ab ==> ab
 			str2 ="baba";     // ba ==> ab
 			output: true
     */


        Queue<String> q = new PriorityQueue<>(); // FIFO
        q.add("e");
        q.add("f");
        q.add("q");
        q.add("d");

        //System.out.println(q);
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

    }
}
