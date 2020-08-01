package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

   static String name ="Cybertek School";
   static Tester tester1 = new Tester();
   //tester1.setInfo("Muhtar",123,"SDET",50);
   int insVariable;

    static {
        //designed for statics only
        //gets executed as soon as class is loaded
        //designed to initialzie static variables

        name = "Cybertek School";
        tester1.setTesterInfo("Muhtar",123,"SDET",50);
        tester1.setTesterInfo("Namıl",111,"Manule Tester",50);

      // StaticBlock4 obj=new StaticBlock4();

        //obj.insVariable=300; do not use static block for initializing

    }

    public static void main(String[] args) {
        System.out.println(name);

        StaticBlock4 obj2=new StaticBlock4();
        System.out.println(obj2.insVariable);//0

    }

}
