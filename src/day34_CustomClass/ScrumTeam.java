package day34_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Tester> testerteam=new ArrayList<>();



    public void hireTester(Tester tester){
        testerteam.add(tester);
    }

    public void fireTester(long employeeID){
        testerteam.removeIf(p-> p.employeeID ==employeeID);
    }


}
