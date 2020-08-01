package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals={"Tiger","Lion","Monkey"};
        String[] birds={"Eagle","Piegon","Peacock"};

        String[][] zoo={wildAnimals,birds};

       String kfc= zoo[1][2];//bir
        System.out.println(kfc);

        for(String EachBirds : zoo[1]){
            System.out.println(EachBirds);
            if(EachBirds.equals("Piegon")){
                continue;
            }
        }

        for(String EachwildAnimals :zoo[0]){
            System.out.println(EachwildAnimals);
        }









    }
}
