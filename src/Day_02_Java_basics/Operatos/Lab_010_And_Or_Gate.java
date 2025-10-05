package Day_02_Java_basics.Operatos;

public class Lab_010_And_Or_Gate {
    static void main(String[] args) {
         //AND Gate   T && T = =T
        System.out.println(true && true); // True
        System.out.println(false && true); // false
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        // OR Gate  F || F = F

        System.out.println(false || false);     //false
        System.out.println(true || false);     //True
        System.out.println(false || true);     //True
        System.out.println(true || true);     //True

    }
}
