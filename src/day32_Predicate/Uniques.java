package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        //write a program that can return the unique objects from arraylist of characters
        Character[] chars={'A','A','B','C','D','D'};
        ArrayList<Character> characterlist=new ArrayList<>(Arrays.asList(chars));
        System.out.println(characterlist);

    ArrayList<Character> result=new ArrayList<>(); // B,C

        for(int i=0;i<characterlist.size();i++){
            int count1=Collections.frequency(characterlist,characterlist.get(i));
            if(count1==1){
                result.add(characterlist.get(i));
            }
        }

        /*
        for(Character each :characterlist){

            int count=   Collections.frequency(characterlist,each);
            if(count==1){
                result.add(each);
            }
        }*/
        System.out.println(result);



    }

}
