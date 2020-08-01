package SolutionArea;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import javax.jws.soap.SOAPBinding;
import java.beans.beancontext.BeanContext;
import java.util.*;
import java.util.function.Predicate;

public class Solution {



    public static void main(String[] args) {
        /*
     24 Create ArrayList and add all this number into this list and declare them
   1,2,3 ,4,5,6,7,8, 1, 3, 3, 3, 3, 3, 3, 3
   then remove these numbers    3,1,5,8 and declare this  [2, 4, 6, 7]

     */



 for(int i=1;i<13;i++){
    if(i%2==0){
        System.out.println("Codility");
    }else if(i%3==0 && !(i%5==0)){
        System.out.println("Test");
    }else if(!(i%3==0) && (i%5==0)){
        System.out.println("Coders");
    }else if(i%3==0 &&i%2==0 && !(i%5==0)){
        System.out.println(("CodilityTest"));
    }else if(i%3==0 &&i%2==0 && (i%5==0)){
        System.out.println("CodilityTestCoders");
    }else if(!(i%3==0) &&i%2==0 && (i%5==0)){
        System.out.println("CodilityCoders");
    }else{
        System.out.println(i);
    }


 }














    }



}

