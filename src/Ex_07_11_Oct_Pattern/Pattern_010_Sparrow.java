package Ex_07_11_Oct_Pattern;

public class Pattern_010_Sparrow {
    static void main(String[] args) {
        int n=5;
        int count=0;
        char let= 'A';

        for (int i=0;i<2*n-1;i++){

            int star1=i<n? i+1:2*n-i-1;

            for (int j=0;j<star1;j++)
            {
                System.out.print("* ");
                count++;
            }

            int space=i<n? 2*(n-i)-2:2*(i-n)+2;

            for (int k=0;k<space;k++)
            {
                System.out.print("  ");
            }

            int star=i<n? i+1:2*n-i-1;
            for (int j=0;j<star;j++)
            {
                System.out.print("* ");
                count++;
            }
            System.out.println();
            let ++;

        }
        System.out.println(count);
    }
}
