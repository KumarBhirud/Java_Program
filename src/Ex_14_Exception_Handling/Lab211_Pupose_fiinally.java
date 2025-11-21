package Ex_14_Exception_Handling;

import java.util.Scanner;

public class Lab211_Pupose_fiinally {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            int v=sc.nextInt();
            int a = 10/v;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

   }
}
