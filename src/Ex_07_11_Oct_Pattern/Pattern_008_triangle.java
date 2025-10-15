package Ex_07_11_Oct_Pattern;

import java.util.Scanner;

public class Pattern_008_triangle {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i ;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
