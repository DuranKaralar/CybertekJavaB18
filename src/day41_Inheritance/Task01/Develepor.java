package day41_Inheritance.Task01;

public class Develepor extends Employee{
/*
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
 */
    /*
  /*
    name(inherited)
    salary (inherited)
    id(inherited)
    jobtitle(inherited)
    gender(inherited)
    fixingBug()
    coding()
    toString() (inherited)
     */


    public Develepor(double salary,String name, long id,String jobTitle,char gender){
    this.salary=salary;
    this.name=name;
    this.gender=gender;
    this.jobTitle=jobTitle;
    this.id=id;

    }

    public void fixingBug(){
        System.out.println(name+" is fixing the Bug");
    }

    public void coding(){
        System.out.println(name+" is coding");
    }



}
