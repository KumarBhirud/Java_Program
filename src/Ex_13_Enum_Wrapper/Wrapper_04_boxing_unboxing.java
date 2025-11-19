package Ex_13_Enum_Wrapper;

public class Wrapper_04_boxing_unboxing {

    static void main(String[] args) {
        int num=10;
        Integer aa=num;

        // Boxing - primitive - Wrapper - AutoBoxing - JVM will do it.

        System.out.println(aa.intValue());
        System.out.println(aa);
        System.out.println(num);


        // UnBoxing (wrapper -> primitive)

        Integer bb = 43;
        int a1=bb;
        System.out.println(bb);

    }
}
