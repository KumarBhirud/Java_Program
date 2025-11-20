package Ex_07_11_Oct_Pattern;

public class Pattern_012_Triangle_01 {
    static int n=5;

    static void main(String[] args) {
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print(" 1");
                }else
                    {
                        System.out.print(" 0");
                    }
            }
            System.out.println();
        }
    }
}
