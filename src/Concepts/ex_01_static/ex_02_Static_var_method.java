package Concepts.ex_01_static;

public class ex_02_Static_var_method {

    int i=10;
    static int b=20;

    void normal_method(){
        System.out.println("this is normal method");
    }
    static void static_method(){
        System.out.println("this is Static method");
    }

    void display (){
//        static int i=20;   // static var not allowed
        System.out.println(i);
        System.out.println(b);
        normal_method();
        static_method();
    }

    static void show (){
//        System.out.println(i);    // to access create an object of class
        System.out.println(b);
        static_method();
        ex_02_Static_var_method co1=new ex_02_Static_var_method();
        System.out.println(co1.i);
        co1.normal_method();

    }

    static void main() {
        show();
        ex_02_Static_var_method co1=new ex_02_Static_var_method();
        co1.display();
    }

}
