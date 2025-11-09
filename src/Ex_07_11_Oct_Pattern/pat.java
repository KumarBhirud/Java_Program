package Ex_07_11_Oct_Pattern;

public class pat {
    static void main(String[] args) {
                int n=5;
                m4(5);
//                m3(n);
        System.out.println();
//                m2(n);
//        System.out.println();
//                xpatt(n);
//        System.out.println();
//                m1(n);

        }

    static void m4 (int n)
    {

        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


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

        static void m2 (int n)
        {

                for (int i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        if (i<=j )
                            System.out.print ("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
        }

   static void m1 (int n)
    {
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i>=j )
                    System.out.print ("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void xpatt (int n)
    {
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j || i+j==n-1)
                    System.out.print ("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
