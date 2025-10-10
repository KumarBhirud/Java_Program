package Ex_04_Oct_Java_Functins_or_Methods;

import java.util.Scanner;

public class Lab_003_User_Defined_Methods
{
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value of a");
        int a= sc.nextInt();

        System.out.println("Enter value of b");
        int b= sc.nextInt();

        int result=sum_of_ab(a,b);
        int result2=sum_of_ab(15,25);
        int result3=sum_of_ab(333,444);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        sum_of_ab();


    }
    static int sum_of_ab(int a, int b)
    {
        return (a+b);
    }
   static void sum_of_ab()
    {
        System.out.println("iam here");
    }
}
