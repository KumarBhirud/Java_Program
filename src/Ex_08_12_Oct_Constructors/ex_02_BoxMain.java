package Ex_08_12_Oct_Constructors;

public class ex_02_BoxMain {
    static void main(String[] args) {

        ex_01_Box b1=new ex_01_Box();
        System.out.println(b1.volume());

        ex_01_Box b2=new ex_01_Box(20,20,20);
        System.out.println(b2.volume());

        ex_01_Box b3=new ex_01_Box(10);
        System.out.println(b3.volume());
    }
}
