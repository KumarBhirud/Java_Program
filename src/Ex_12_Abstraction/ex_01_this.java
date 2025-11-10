package Ex_12_Abstraction;

public class ex_01_this{
    static void main(String[] args) {
        child c1=new child();
        c1.all();
    }
}
class parent {
    String home="2bhk";
     int member=4;
    void stay(){
        System.out.println("this is parent home");
    }
    static void sleep(){
        System.out.println("this is parent home and i stay here");
    }
}
class child extends parent{
    int member=2;
    String home="3BHK";
    void ch1(){
        System.out.println("in child home");
    }
    static void sleep() {
        System.out.println("this is child home");
    }

    void all(){
        String home1 = this.home;
        System.out.println(home1);
        this.sleep();
        super.sleep();
    }

}