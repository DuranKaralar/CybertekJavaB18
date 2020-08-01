package day14_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
 */
public class Practice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=scan.next();
        System.out.println("Enter second word");
        String word2=scan.next();
        System.out.println("Enter third word");
        String word3=scan.next();

        int length1=word1.length();
        int length2=word2.length();
        int length3=word3.length();

        boolean allnotSame=length1!=length2&&length2 !=length3;
                   // not of them are same with each other
        if(length1 == length2 && length2==length3){
            System.out.println("All the words are same length");
        }else if(allnotSame){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }











    }
}
