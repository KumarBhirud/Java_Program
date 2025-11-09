package Ex_07_11_Oct_Pattern;

public class Diamond {
    static void main(String[] args) {
        int n=5;
//       m1(n);
//       m2(n);
//       merged(n);
        m1m2(n);

    }

    static void m1m2(int n) {
        for (int i = 0; i < 2 * n-1; i++) {
            int space = i <n ? n - i-1  : i - n+1;
            int stars = i < n ? 2 * i : 2 * (2*n-i)-4;
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        static void m2 ( int n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * (n - i) - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void m1 ( int n)
        {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= 2 * i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        static void merged ( int n){
            for (int i = 0; i <= 2 * n; i++) {
                int space = i < n ? n - i : i - n;
                int stars = i < n ? 2 * i : 2 * (2 * n - i);
                for (int j = 0; j < space; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= stars; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
