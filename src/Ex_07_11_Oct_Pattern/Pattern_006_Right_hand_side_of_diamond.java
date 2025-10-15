package Ex_07_11_Oct_Pattern;

public class Pattern_006_Right_hand_side_of_diamond {
    static void main(String[] args) {
        pattern02(3);
        pattern03(5);
        pattern04(5);
        pattern06(5);
        pattern05(5);
    }

    //Left side
    static void pattern02 (int n){
        for (int i=0;i<2*n;i++){
            int s=n<i? n-i:2*n-i;
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            int tcols=i<n? i : 2*n-i;
            for (int j=0;j<tcols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern03(int n){
        for (int i=0;i<n;i++){
            int s=i<n? n-i:2*n-i+1;
            int p=i<n? i:(2*n-i);
            for (int j=0; j<s;j++){
                System.out.print(" ");
            }
            for (int j=0;j<p;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    //Right side
    static void pattern04 (int n){
        for (int i=0;i<2*n;i++){
            int tcols=i<n? i : 2*n-i;
            for (int j=0;j<tcols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Upper Half
    static void pattern05 (int n){
        for (int i=0;i<2*n;i++){
            int tcols=i>n?2*n-i:i;
            int tspaces=n-tcols;
            for (int s=0;s<tspaces;s++)
                System.out.print(" ");
            for (int j=0;j<tcols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Diamond
    static void pattern06(int n){
        for (int i=0;i<n;i++) {
            int tcols = i > n ? 2 * n - i : i;
           // int tspaces = n - tcols;
            for (int s = 0; s < n-i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < tcols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
