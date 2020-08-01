package day48_Abstraction;


interface I1{
void method1();
}
interface  I2 extends  I1{
void  method2();
}

abstract class AC implements I2{
    public abstract void method3();
}



public abstract class extends_implements  extends  AC{//3 ABSTRACT CLASS
    @Override
    public void method2(){
        //2 absract class is left
    }


}
