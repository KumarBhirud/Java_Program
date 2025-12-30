package Concepts.ex_01_static;

public class ex_01_Static_var {

    int a=10;
    static int b=10;

    static void main(String[] args) {

//        System.out.println(Static_var.b);

        ex_01_Static_var st=new ex_01_Static_var();
        System.out.println(st.a);
        System.out.println(st.b);

        ex_01_Static_var st1= new ex_01_Static_var();
        int x=st1.a++;
        System.out.println(x);
        int y=st1.b++;
        System.out.println(y);

        ex_01_Static_var st2= new ex_01_Static_var();
        int p=st2.a++;

        System.out.println(p);
        int q=st.b++;
        System.out.println(q);

        ex_01_Static_var st3= new ex_01_Static_var();
        int r=st3.a++;

        System.out.println(r);
        int s=st3.b++;
        System.out.println(s);

    }
}
