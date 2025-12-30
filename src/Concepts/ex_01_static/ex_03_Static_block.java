package Concepts.ex_01_static;

public class ex_03_Static_block {
    ex_03_Static_block(){
        System.out.println("this is constructor");
    }
    {
        System.out.println("this is static initialiser block");
    }
   static
    {
        System.out.println("this is static block");
    }
    static void main()
    {
        ex_03_Static_block obj=new ex_03_Static_block();
        ex_03_Static_block obj1=new ex_03_Static_block();
    }
}
