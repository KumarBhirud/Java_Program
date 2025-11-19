package Ex_07_11_Oct_Pattern;

public class Pattern_013_damru {

    static void main(String[] args) {
        int n=5;
        int count=0;
        char let= 'A';

        for (int i=0;i<2*n-1;i++){

            int space=i<n? i:2*n-i-2;

            for (int j=0;j<space;j++)
            {
                System.out.print("  ");
            }

            int star=i<n? 2*(n-i)-1:2*(i-n)+3;

            for (int k=0;k<star;k++)
            {
                System.out.print("* ");
            }

            int space2=i<n? i+1:2*n-i-1;
            for (int j=0;j<space;j++)
            {
                System.out.print("  ");
                count++;
            }
            System.out.println();
            let ++;

        }
        System.out.println(count);
    }
}
