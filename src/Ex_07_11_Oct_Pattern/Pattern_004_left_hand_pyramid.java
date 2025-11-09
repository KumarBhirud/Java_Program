package Ex_07_11_Oct_Pattern;

import java.util.Scanner;

public class Pattern_004_left_hand_pyramid {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++) {
            for (int j=0;j<n-i-1 ;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    or method
static void m3 (int n)
{

    for (int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++) {
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
