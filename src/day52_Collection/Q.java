package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {

        Queue<String> q=new PriorityQueue<>();//
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");

    String str=    q.poll(); // A it returns A as a String and we can assign it to String variable
        System.out.println(str); // it olso remove the first inserted data

        System.out.println(q); //while we are trying to get method, it give us compile eror



    }

}
