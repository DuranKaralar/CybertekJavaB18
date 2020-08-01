package day54_Maps;

import java.security.KeyStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_SetEntry {

    public static void main(String[] args) {

        LinkedHashMap<String,String> countries=new LinkedHashMap<>();
        countries.put("Turkey","Kahramanmaras");
        countries.put("USA","Teneesee");
        countries.put("Polonya","Lodz");
        countries.put("Italy","Roma");
        countries.put("France","Paris");


         countries.entrySet();

         String input="Turkey";
        for(Map.Entry<String,String> eachline : countries.entrySet()){
            //getKey
            //getValue

            System.out.println(eachline.getKey()+"s capital is "+eachline.getValue());
            String countryName=eachline.getKey();
            String cityName=eachline.getValue();

            if(input.equalsIgnoreCase(countryName)){
                System.out.println(cityName);
            }
        }



    }

}
