package Concepts.ex_01_static;

public class ex_04_Static_inner_class {

    static class A{
        int p=10;
        static int q=20;

        void showA (){
            System.out.println("method from A");
        }
        static void displayA (){
            System.out.println("static method from A");
        }
    }

    int a=10;
    static int b=20;

    void display (){
        System.out.println("this is normal method");
    }

    static void show (){
        System.out.println("this is static method");
    }

   public static void main() {
        A a=new A();
       System.out.println(a.p);
       System.out.println(a.q);
       a.showA();
       a.displayA();
     }
}
