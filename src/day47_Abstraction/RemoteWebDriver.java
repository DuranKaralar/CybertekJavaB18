package day47_Abstraction;

import day46_final_abstract.Shape;

public abstract class RemoteWebDriver  {

    /*
    There are two way that we can achieve it,
    1.Abstract Class
    2.Interface

    we cannot inherited final classes abstract and final cannot be together
    we can not give private for abstract except private we can give the other ones
    we cannot override static method, private method and final method
     */
     public abstract void get(String URL);

     public abstract void  quit();// without body and meant to be override


}
