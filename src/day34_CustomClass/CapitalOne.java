package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

       Tester tester1=new Tester();
       tester1.setTesterInfo("Muhtar",123,"Manuel Tester",70000);

        ScrumTeam scrum=new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testerteam.size());// arraylist we have in scrum team // it returns us 1

        scrum.fireTester(123);

        System.out.println(scrum.testerteam);






    }
}
