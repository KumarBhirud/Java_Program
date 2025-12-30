package Ex_12_Abstraction;

abstract class a1 {
    int a=10;
    abstract void ab1();
}

class nc1 {
    int b = 20;

    void nm1() {
        System.out.println("This id nm from nc");
    }
    static void sm1(){
        System.out.println("this is static method from interface");
    }
}
interface ic{
    default void dm (){
    System.out.println("this is dm from interface");
}
    static void sm(){
    System.out.println("this is static method from interface");
        }
}
public class Ex_03_my extends nc1 implements ic{

}