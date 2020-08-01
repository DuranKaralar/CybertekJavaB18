package day41_Inheritance.Task01;



public class EmployeeObjects {

    public static void main(String[] args) {

        Develepor dev1=new Develepor(1200,"Bekir",123,"Manuel Tester",'M');

        dev1.fixingBug();
        System.out.println(dev1);

        Tester test1=new Tester(50,"Oktay",124,"QA TESTER",'M');


        test1.reporting();
        System.out.println(test1);

        BusinessAnalyst BA1=new BusinessAnalyst(40,"Ali",123,"tester",'m');
         BA1.gathering();
         BA1.writingReq();

        System.out.println(BA1);
    }

}
