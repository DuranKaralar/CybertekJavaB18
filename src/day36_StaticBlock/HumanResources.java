package day36_StaticBlock;

import Practice_04_22_2020.Developer;
import day34_CustomClass.Tester;

public class HumanResources {
//tester1.setTesterInfo("Bekir",124,"SDET",50);  it has to be in a block
     static  Tester tester1=new Tester();
    static  Tester tester2=new Tester();
    static  Tester tester3=new Tester();
    static  Tester tester4=new Tester();
    static  Tester tester5=new Tester();
/*public static void main(String[] args) {
        tester1.setTesterInfo("Bekir",124,"SDET",50);
    }*/

   static {
       tester1=new Tester();
       tester1.setTesterInfo("Bekir",124,"SDET",50);
   }



}
