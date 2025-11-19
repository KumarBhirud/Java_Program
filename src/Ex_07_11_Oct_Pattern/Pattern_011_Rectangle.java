package Ex_07_11_Oct_Pattern;

public class Pattern_011_Rectangle {

    static int n = 5;
    static char lets = 'A';

   public static void main(String[] args) {

        for(int i = 0;i<n;i++) {


        for (int j = 0; j < 2*n; j++) {
            if(i==0 || j==0 || i==n-1 || j==2*n-1)
            System.out.print("* ");
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
//        lets++;

    }
}
}
