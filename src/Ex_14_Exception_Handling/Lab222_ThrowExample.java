package Ex_14_Exception_Handling;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Lab222_ThrowExample {
    static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int user_age=sc.nextInt();
        validate_ege_for_club(user_age);

    }
            static void validate_ege_for_club(int age)throws Exception{
        if (age<25){
            throw new Exception("age can't be less than 25");
        }else {
            System.out.println("Enjoying clubbing");

        }

    }
}
