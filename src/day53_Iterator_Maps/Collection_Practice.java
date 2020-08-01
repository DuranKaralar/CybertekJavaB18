package day53_Iterator_Maps;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Collection_Practice {

    /*
    access-modifiers specifier return type methodsName

    specifiers: static final, abstract, synchronized

     */
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list= Collections.synchronizedList(list);//Thread- Safe

        Set<Integer> set=new HashSet<>();
        set=Collections.synchronizedSet(set);//thread-safe


        System.out.println("==================");

        String[] arr={"E","B","A","D","D","C","A"}; //EBADC
        LinkedHashSet<String> st=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(st);
       /* for(String each : arr){
            st.add(each);

        }*/


        ArrayList<String> list2=new ArrayList<>(Arrays.asList("E","B","A","D","D","C","A"));
        LinkedHashSet<String> st2=new LinkedHashSet<>(list2);
        System.out.println(list2);




    }

    public synchronized void  append(){

    }


}
