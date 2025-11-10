package Ex_09_12_Oct_Polymorphism;

public class MOverriding {
    static void main(String[] args) {

        son s1=new son();
        s1.home();

        Father f1=new Father();
        f1.home();

        Father f2=new son();
        f2.home();

    }
}

class Father{
    void home() {
        System.out.println("2BHK");
    }
}
class son extends Father {
    @Override
    void home() {
        System.out.println("3BHK");
    }
}