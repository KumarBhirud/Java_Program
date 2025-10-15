package Ex_07_11_Oct_Pattern;

import java.util.Scanner;

public class Pattern_005_left_hand_pyramid_mirror {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
