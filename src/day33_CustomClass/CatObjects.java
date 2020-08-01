package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    public static void main(String[] args) {

        Cat cat1=new Cat();
        cat1.setCatInfo("Siemes","White","Karabaş",4);

        System.out.println(cat1);

        Cat cat2=new Cat();
        cat2.setCatInfo("Scottish","Beige","Bobo",7);

        Cat cat3=new Cat();
        cat3.setCatInfo("Calliso","Melo","Felipe",37);

        ArrayList<Cat> catlist=new ArrayList<>();
        catlist.addAll(Arrays.asList(cat1,cat2,cat3));

        for(int i=0;i<catlist.size();i++){
            System.out.println(catlist.get(i));
        }

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        cat1.eat("cat treats");


        /*
        practice task:
          create a custom class for bank account
             attrubutes: accountholder,accountnumber,balance;
                actions:checkingBalance()withDraw(), deposit();
         */



    }

}
