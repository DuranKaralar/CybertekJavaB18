package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x%2 !=0;

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println();

        Predicate<Integer> lessThan5=x-> x<5;
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(lessThan5); //


        System.out.println(list2);//5, 6, 7, 8, 9, 10

        System.out.println("===============================");
        Predicate<String> startsWithM=s -> s.toLowerCase().startsWith("m");

        ArrayList<String>  names=new ArrayList<>(Arrays.asList("Murtaza","Mohammed","Boris","Sha","Bilal"));

        names.removeIf(startsWithM);
        System.out.println(names);
        System.out.println("==================================");
        Predicate<String> startsWithAM=f -> f.toLowerCase().startsWith("m") ||f.toLowerCase().startsWith("a");

        ArrayList<String> namelist =new ArrayList<>(Arrays.asList("Muhtar","Alex","Asiya","Dilnaz","Radu"));

        namelist.removeIf(startsWithAM);

        System.out.println(namelist);

        System.out.println("=======================");
        //Predicate<Character> digits=c -> c >= 48 && c <=57;
        Predicate<Character> digits=c -> Character.isDigit(c);
        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','2','3','5','@','Z'));

        chars.removeIf(digits);

        System.out.println("============================");
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        nums.removeIf(p -> p>5);

        System.out.println(nums);







    }
}
