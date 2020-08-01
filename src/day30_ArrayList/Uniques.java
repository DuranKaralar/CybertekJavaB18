package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        /*
        	3. write a program that can find  out the unique elements from an ArrayList of Integers and
        	 store into another called
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
         */


        ArrayList<Integer> list=new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(1);

          ArrayList<Integer> uniques=new ArrayList<>();
          //lis.get(0) ==>1
          int count=0;
        // for(int i=0;i<list.size();i++){
          for(Integer each2 : list){
             for(Integer each : list){
                 if(each ==each2){
                     count++;


                     }
                 }
                 if(count == 1 ){
                     uniques.add(each2);
             }

         }

        System.out.println(uniques);
        System.out.println(list);


    }

}
