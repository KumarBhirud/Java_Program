package Day_02_Java_basics.Operatos;

public class Lab_007_Inerview_Concat_Plus {
    static void main(String[] args) {
         int a=10;
         int b=20;
         String First="Kumar";
         String Last ="Bhirud";

        System.out.println(a+b);                //30
        System.out.println(First+Last);         //KumarBhirud
        System.out.println("Pramod"+"Dutta");   //PramodDutta
        System.out.println(First+Last+a+b);     //KumarBhirud1020
        System.out.println(a+b+"Pramod"+"Dutta");     //30PramodDutta
    }
}
