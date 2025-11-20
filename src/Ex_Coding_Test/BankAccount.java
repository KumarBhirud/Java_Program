package Ex_Coding_Test;

import java.util.Scanner;

public class BankAccount {
    Scanner sc=new Scanner(System.in);

    private int balance=1000;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int newbalance) {
        this.balance = newbalance;
    }

    void deposit(int DepositAmount){
        if (DepositAmount>0){
        int balance=this.balance+DepositAmount;
        }else {
            System.out.println("enter valid amount");
        }
        setBalance(balance);
        System.out.println("New balance = "+getBalance());
    }
    void withdraw(int withdrawAmount){
        if (withdrawAmount>0 && balance>withdrawAmount){
            int balance=this.balance-withdrawAmount;
        }else {
            System.out.println("enter valid amount");
        }
        setBalance(balance);
        System.out.println("New balance = "+getBalance());

    }


    static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba.getBalance());
    }
}
