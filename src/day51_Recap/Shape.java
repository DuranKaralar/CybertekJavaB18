package day51_Recap;
/*
 1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();

    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double

    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)


 */
public abstract class Shape {




    public abstract double calculateArea(); // we can give return type to abstract methods

    public abstract double  calculatePerimeter();

}

interface Volume{
    boolean hasVolume=true;  // we can not leave it boolean hasVolume; because we need to initialize it

    public double caculateVolume();
}

interface PI{
    double PI=3.14; // we need to initialize it
}