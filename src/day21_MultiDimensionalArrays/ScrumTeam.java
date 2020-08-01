package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[] DevTeam ={"Zeynep","Haider","Jpovid","Muhtar"};
        String[] TesTeam={"Rahman","Bekir","Osman","Ali"};
        String[] PO ={"Barzy","Donald"};
        String[] TesTeam2={"Ilham","Veli","Duran"};

        String[][] ScrumTeam ={DevTeam,TesTeam,PO};

        ScrumTeam[1]=TesTeam; // We can assign it to

        ScrumTeam [0][3] ="Jean";

        System.out.println(ScrumTeam[0][3]);
        String info =ScrumTeam[1][2];

        System.out.println(info);

        System.out.println("==============================");

        for(String eachEmploye:ScrumTeam[0]){ //DevTeam
            System.out.println(eachEmploye);
        }


        System.out.println("====================================");
        String[] TestersTeam2={"Ilham"};




    }
}
