package day48_Abstraction;

interface P{
void method1();
}
interface Q{
void method2();
}

abstract class R{
public abstract void method3();}



public class extends_implements2 extends R implements P,Q{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }// extends keywords must be first and
    // we can use both of them like these AND it is for abstract class

    public static void main(String[] args) {

       // R obj=new R(); NOT concrete
    }
}
