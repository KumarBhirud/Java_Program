package Ex_07_11_Oct_Pattern;

import java.util.Scanner;

public class Pattern_003_Right_hand_pyramid_mirror {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i ;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
