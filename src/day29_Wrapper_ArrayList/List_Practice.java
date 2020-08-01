package day29_Wrapper_ArrayList;

import java.util.ArrayList;
public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String> shoppingList =new ArrayList<>();
        System.out.println(shoppingList);

        shoppingList.add("Milk"); //Size: 1
        shoppingList.add("Cofffee");
        shoppingList.add("Bread");
        shoppingList.add("Toilet Paper"); //size is 4
        shoppingList.add("Eggs");
/*System.out.println(shoppingList.get(0));
      System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));*/

        System.out.println("=============");
        for(int i=0;i<shoppingList.size();i++){
            System.out.println(shoppingList.get(i));
        }
        System.out.println("===============");
        for(String each:shoppingList){
            System.out.println(each);
        }


          //size();
       int a= shoppingList.size(); //return type is int

        System.out.println(a);

        int lastinedex=shoppingList.size()-1;
        System.out.println(lastinedex);

    }

}
