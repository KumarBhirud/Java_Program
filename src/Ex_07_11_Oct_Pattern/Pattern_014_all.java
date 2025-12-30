package Ex_07_11_Oct_Pattern;

public class Pattern_014_all {

    static void main(String[] args) {
        int n = 5;
        m1(n);

    }
    static void m1(int num){
        for (int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if ((i<=j)) {
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
