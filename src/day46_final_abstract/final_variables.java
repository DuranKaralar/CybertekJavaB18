
package day46_final_abstract;

import day37_Constructors.InstanceBlock;

public class final_variables {

      final   int InstanceVariable=300;
      final int InstanceVariable2=200;// we need to initialete as soon as possible
    // because şn other case it gives us compile errror


    static int Static1=200; // This static variable doesnt mean that it is constant, it only
    //have just one copy but we can assign it again

    final static int staticVariable=10000;// but when we assign final we cannot reassign it and we
    //we need to initialize as soon as possible in the same line
    // final static int staticVariable2;


    public static void main(String[] args) {

        final double PI=3.14;
        //PI=3.15;  // We are reassigning it in here in order to make it final we need to make final double=3.14;

        final String gender="Male";

        // when we assign final we cannot assiğn anything else

        final int score;

       // System.out.println(score);// it gives us compile error because we havent assigned number to it so that we cannot print

        score=100;
        System.out.println(score);// it compiles because we assigned number to score

        //final assigned just once, we cannot assign twice, if we cant anythinng to be constant we can use,
        // we used in local veriables and we can use it InstanceVariable
        //while we are using instancevariable, when we give it final


        System.out.println("=============");

        final_variables obj=new final_variables();
        //obj.InstanceVariable=400;







    }

}
