package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCaalculator zareen=new SalaryCaalculator(50,40,8.25/100,0.2);

        System.out.println(zareen.salary());

        System.out.println(zareen);

        SalaryCaalculator Namik=new SalaryCaalculator(62,40,8.75/100,0.26);

        System.out.println(Namik);

    }


}
