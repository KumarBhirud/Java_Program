package Ex_12_Abstraction;

public class Abs {
    static void main(String[] args) {
        //ex of abstract class
        ak aakkk=new ak();
        aakkk.load10k();
        aakkk.loan50k();
    }
}

abstract class akfather {

    abstract void loan50k ();
    void load10k(){
        System.out.println("Given");
    }
}
class ak extends akfather {

    @Override
    void loan50k() {
        System.out.println("i am Ak, and i will give 50k loan ");
    }
}

abstract class c1{
    abstract void m1();
    abstract void m2();

}
class f1 extends c1{

    @Override
    void m1() {
        System.out.println("m1 body");
    }

    @Override
    void m2() {
        System.out.println("m2 body");
    }
}