package Ex_14_Exception_Handling;

public class Lab208_arithmatic {

    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println("Not allowed");
        }
        catch (Exception e) {
            System.out.println("Hello");
        }
        catch (Throwable e) {
            System.out.println("Not allowed");
        }
    }
}
