package Ex_14_Exception_Handling;

import static java.lang.System.*;

public class Lab207_Try_catch {
    static void main(String[] args) {

        String s1=null;

        try {
            s1.trim();
        } catch (Exception e) {
            out.println(e.getMessage());
        }
      }
}
