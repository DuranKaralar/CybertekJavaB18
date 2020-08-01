package SolutionArea;

class takım{
    int a=10;
    int b=9;
    public void sampiyon(){
        System.out.println("Takımlar şampiyon olmalı");
    }
}
class fenerbahçe extends takım{
    int a=28;
    public void sampiyon(){
        System.out.println("Fenerbahçe 28 şampiyonluk aldı");
    }
}

class gs extends takım{
    int a=22;
    public void sampiyon(){
        System.out.println("GS 22 kere şampiyon oldu");
    }
}


public class PolyMorphism {

    public static void main(String[] args) {
        takım t1=new fenerbahçe();
        t1.sampiyon();
        System.out.println(t1.a);
        System.out.println("=========0");
        fenerbahçe t2=new fenerbahçe();
        System.out.println(t2.b);
        System.out.println(t2.a);

    }

}



