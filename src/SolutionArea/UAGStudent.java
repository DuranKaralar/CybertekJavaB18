package SolutionArea;

public class UAGStudent {
    String name;
    int grade;
   static String principalName ="Ms. McKoy";
   String studentID;
   static int nextID=100;

  public UAGStudent(String name,int grade){
      this.name=name;
      this.grade=grade;
      studentID=name.substring(0,1).toUpperCase()+nextID;
      nextID++;
  }

  public static void newPrincipal(String name){
      principalName=name;
  }

  public static void resetID(){
      nextID=100;
  }
  public String toString(){
      return "Student's name "+name+"Student's ID "+studentID;
  }
}
