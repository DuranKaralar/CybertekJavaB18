package day38_Constructors;

public class SalaryCaalculator {
   /* Task03:
    Create class called SalaryCalculator
            instance variables:
    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
    add a constructor can initialize those fields
    instance methods:
    salary(): returns the total salary as double
    salaryAftertax(): retuns the salary after tax as double
    stateTax(): retuns the total state tax as double
    federalTax(): retuns the total federal tax as double
    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary() */

   double hourlyRate;
   int weeklyHour;
   double stateTaxRate;
   double federalTaxRate;

   public SalaryCaalculator(double hourlyRate,int weeklyHour,double stateTaxRate,double federalTaxRate){

       this.hourlyRate=hourlyRate;
       this.weeklyHour=weeklyHour;
       this.stateTaxRate=stateTaxRate;
       this.federalTaxRate=federalTaxRate;

   }

   public double salary(){//annual income
       return hourlyRate *weeklyHour*52;
   }

   public double stateTax(){//total tax paid to state
       return salary()*stateTaxRate;
   }

   public double federalTax(){ // total tax paid to federal
       return  salary()*federalTaxRate;
   }

   public double salaryAfterTax(){// salary after tax
       return salary()-stateTax()-federalTax();
   }

   public String toString(){
       return "Hourly rate: $"+hourlyRate+
       "\nWeekly Hours: "+weeklyHour+
       "\nGross Salary: $"+salary()+
       "\nState Tax: $"+stateTax()+
       "\nFederal Tax: $" +federalTax()+
               "\nNet Income: $"+salaryAfterTax();
   }

}
