package Ex_14_Exception_Handling;

public class Lab209_Multiple_program {

    static void main(String[] args) {
        int a = 0;
        int c = 0;

        try {
            c = 10 / a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
