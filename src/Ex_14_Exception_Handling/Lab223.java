package Ex_14_Exception_Handling;

public class Lab223 {

    public static void main(String[] args) {
        try {
            int a =  10/10;
            System.out.println("Try Executed");
            System.exit(0);
//            return;
        } catch (Exception e) {
            System.out.println("Catching the exception");
        } finally {
            System.out.println("I will be always executed!");
        }

    }
}
