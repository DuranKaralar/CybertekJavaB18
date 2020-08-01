package day41_Inheritance.Task01;
/*
 create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering, toString
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee {
    /*
       salary  (Inherited)
       name  (Inherited)
       id  (Inherited)
       jobTitle  (Inherited)
       gender  (Inherited)
       writingReq()
       gathering()
       toString() (Inherited)
        */
    public BusinessAnalyst(double salary,String name, long id,String jobTitle,char gender) {
        this.salary = salary;
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
    }
    public void writingReq(){
        System.out.println(name+" is writing Requirements");
    }
    public void gathering(){
        System.out.println(name+ " is gathering");
    }
}
