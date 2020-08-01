package day34_CustomClass;

import javafx.scene.SceneAntialiasing;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentInfo("Adam","England",24,2.60,'M',true);
        Student student2=new Student();
        student2.setStudentInfo("Emmaa","England",24,1.60,'M',true);
        Student student3=new Student();
        student3.setStudentInfo("Veli","England",24,3.50,'M',true);
        Student student4=new Student();
        student4.setStudentInfo("Ali","England",24,3.10,'M',true);


        Student[]  students={student1,student2,student3,student4};

        ArrayList<Student> list=new ArrayList<>(Arrays.asList(students));
        list.removeIf(p-> p.gpa<=3.0);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            Student each =list.get(i);
            System.out.println(each.name+" can graduate");

        }

        System.out.println("===================================");

        ArrayList<Student> list2=new ArrayList<>(Arrays.asList(students));
        list2.removeIf(p-> p.gpa>3.0);
        System.out.println(list2.size());

        for(Student each :list2){
            System.out.println(each.name+" can graduate");
        }






    }
}
