package Concepts.ex_01_static;

public class ex_05_Static_inner_class_null {

    static class A{
        static int a=10;
        int b=20;

        void display (){
            System.out.println("local method from A");
        }
        static void show (){
            int c=63;
            System.out.println("static method from A");
            System.out.println("C="+c);
        }
    }

    public static void main(String [] args) {
        A a=null;
       System.out.println(a.a);
//       System.out.println(a.b);   //run time error:NullPointerException
//       a.display();        //run time error:NullPointerException
        a.show();
        System.out.println(a.a);
     }
}
