package day34_CustomClass;

public class Tester {
    /*
    create a class called Testers
        Attributes:
        name, employeeID, JobTitle, Salary

        Actions:
        setTesterInfo(), smokeTesting(), cretaingTicket();
     */

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle,double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public String toString(){
        return "Name: "+ name+" Job Title:"+jobTitle+" Employee ID:"+employeeID+" Salary:"+salary;
    }


}
