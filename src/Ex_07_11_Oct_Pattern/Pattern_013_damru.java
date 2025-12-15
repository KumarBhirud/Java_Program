package Ex_07_11_Oct_Pattern;

public class Pattern_013_damru {

    static void main(String[] args) {
        int num = 5;
        int count = 0;
        char let = 'A';
        m1(num);
        m2(num);


    }

static void m1(int n){
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
            }
            System.out.println();
        }
    }
    static void m2 (int n){
        for (int i=0;i<2*n-1;i++){
            int star=i<n? i+1:2*n-i-1;
            for (int j=0;j<star;j++)
            {
                System.out.print("* ");
            }
            int space=i<n? 2*(n-i)-2:2*(i-n)+2;
            for (int k=0;k<space;k++)
            {
                System.out.print("  ");
            }
            int star2=i<n? i+1:2*n-i-1;
            for (int j=0;j<star2;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
