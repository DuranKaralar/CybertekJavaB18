package day47_Abstraction;

public final class  ChromeDriver extends RemoteWebDriver {
    @Override
    public void get(String URL) {
        System.out.println("Openning "+URL+ " in Chrome Browser");
    }
    @Override
    public void quit(){
        System.out.println("Chrome the chrome browser");
    }

}

     /*
    abs we can use abstract key word in
    we cannot create object from object
    abstract is not concrete
    object has to be concrete , we cannot create object from concrete class. we dont need to make subclasses abstract
    but we can do it, but when we do it. we will have error in other pages
     we cannot give return type and method time must be same
     */
