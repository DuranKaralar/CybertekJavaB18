package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock3 {

    static String name;
    static int num;

    static Tester tester1=new Tester();

/*
    public static void main(String[] args) {

        name="Bekir";
        num=4109;

        System.out.println(name);
        System.out.println(num);

*/

static {
    name="Bekir";
    num=4109;

    tester1.setTesterInfo("Bekir",999,"Manuel Tester",41);


    }


}
