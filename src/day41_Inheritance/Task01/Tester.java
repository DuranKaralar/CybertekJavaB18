package day41_Inheritance.Task01;

public class Tester extends Employee {

    public Tester(double salary,String name, long id,String jobTitle,char gender){
        this.salary=salary;
        this.name=name;
        this.gender=gender;
        this.jobTitle=jobTitle;
        this.id=id;
    }

    public void reporting(){
        System.out.println(name+" is reporting ");
    }
}
