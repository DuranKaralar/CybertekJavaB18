package day47_Abstraction;

public class OperaDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in opera browser");
    }

    @Override
    public void quit() {
        System.out.println("Qiting opere browser");
    }
/*
we must to write all abstract methods
 */


}
