package Ex_14_Exception_Handling;

public class Lab216_Fix_first {

    static void main(String[] args) {

        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e ) {
            System.out.println("Problem");
        }finally {
            System.out.println("I will be always called ");
        }
    }
}
