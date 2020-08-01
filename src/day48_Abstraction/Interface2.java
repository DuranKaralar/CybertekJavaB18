package day48_Abstraction;

public interface Interface2 {
   /* public Interface2(){// we cannot call constructur with Interface2
        //becuase it will give us compile error

    }*/
   /*
    public void method1(){
       we cannot have instance method in interface
    }*/

    // we can only have static and final as a variable at the same time

    int a=100;// static is given by default, it is not instance variable, it is

    public static void main(String[] args) {
        System.out.println(a);// this is final and static
      //  a=200; by default final


    }

}
