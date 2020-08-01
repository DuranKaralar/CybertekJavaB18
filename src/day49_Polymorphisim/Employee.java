package day49_Polymorphisim;

public abstract class Employee {
String name;
long id;
String jobtitle;
double Salary;
  abstract void work();

}
class  Tester extends Employee{

    @Override
    void work() {

    }
}
class Developer extends Employee{
    @Override
    void work() {

    }
}
class ScrumTeam extends  Employee{
    void work(){
        
    }
}