package day54_Maps;

public class GarbageCollector {

    public static void main(String[] args) {

       GarbageCollector obj= new GarbageCollector(); //will not be collected by garbage collector
                             new GarbageCollector();//will ne collected by garbage collector

        System.out.println("Done");

        //unreference ab object

        String str=new String("Cybertek");//this will be collected by garbage collector
               str=new String("MIT");

        System.out.println(str);

        Integer num=new Integer(1234);// this will be collected by garbage collector
                num=new Integer(2345);

                Double n=new Double(0.5); // this will be collected
                n=null;// this is the second way of unreferancing object





        System.out.println(n);



    }

}
