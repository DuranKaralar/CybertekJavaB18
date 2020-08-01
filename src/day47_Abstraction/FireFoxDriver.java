package day47_Abstraction;

public  class FireFoxDriver extends RemoteWebDriver {
/*
When abstract class is extended, we need to override and we cannot create object

 */
    public void get(String URL){
        System.out.println("Openning "+URL+" in FireFox is loading");
    }

    public void quit(){
        System.out.println("Closing firefox browser");
    }

}
