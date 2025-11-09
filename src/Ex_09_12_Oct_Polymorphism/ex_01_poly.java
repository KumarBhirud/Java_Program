package Ex_09_12_Oct_Polymorphism;

import java.util.Scanner;

public class ex_01_poly {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        student();
        student(sc.nextInt());
        student(sc.nextInt(),sc.nextInt());

    }
    static void student(){
        System.out.println("me01");
    }
    static void student(int a){
        System.out.println(a);
    }
    static void student(int b,int c){
        System.out.println(b+c);
    }
}

