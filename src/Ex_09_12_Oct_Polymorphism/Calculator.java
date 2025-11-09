package Ex_09_12_Oct_Polymorphism;

public class Calculator {
    static void main(String[] args) {

        Operations ops=new Operations(100);
        System.out.println(ops.add(10,20));
        System.out.println(ops.add(20,20,20));
    }
}
class Operations{
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
    Operations (int x){
        System.out.println(x);
    }
}
