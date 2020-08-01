package SolutionArea;

public class LawSchool extends EducationalInstitution {


    public LawSchool(int years) {
        super(years);
    }

    @Override
    public String graduationRequirements() {
        return super.graduationRequirements()+" and passing the bar";
    }
}
