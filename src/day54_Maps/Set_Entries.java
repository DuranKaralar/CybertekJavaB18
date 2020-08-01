package day54_Maps;

import sun.nio.cs.US_ASCII;

import java.util.*;

public class Set_Entries {

    public static void main(String[] args) {

        LinkedHashMap<String,String> logininfo=new LinkedHashMap<>();

        logininfo.put("bekir","KAR1996");
        logininfo.put("duran","DESC9");
        logininfo.put("karalar","kar1990");

        for(String eachKey :logininfo.keySet()){
            System.out.println(eachKey);
        }
     List<String> usernames=new ArrayList<>(logininfo.keySet());
        System.out.println(usernames);


        System.out.println("======================");


        for(String eachValue : logininfo.values()){
           // System.out.println("Eeach Key  "+fb.get(eachKey));
            System.out.println(eachValue);
        }

        List<String> password=new ArrayList<>(logininfo.values());
        System.out.println(password);


        System.out.println("==================");
        LinkedHashMap<String,Integer> students=new LinkedHashMap<>();

        students.put("Onur", 87);
        students.put("Bekir",90);
        students.put("Murat",77);
        students.put("Rahman",92);
        students.put("Unkun",76);


        Set<String> names=new LinkedHashSet<>(students.keySet());

        LinkedHashMap<String, Integer> badstudents=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> goodstudents=new LinkedHashMap<>();

        for(String eachKey : students.keySet()){
            int eachValue=students.get(eachKey);//Score
            if(eachValue<90){
                System.out.println(eachKey);
                badstudents.put(eachKey,eachValue);
            }else{
                goodstudents.put(eachKey,eachValue);
            }
        }

        System.out.println(goodstudents);
        System.out.println(badstudents);


        System.out.println("============================");






    }

}
