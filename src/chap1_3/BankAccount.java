package chap1_3;

public class BankAccount {

    String accountNumber;
    String owner;
    double balance;


    BankAccount(){

        accountNumber = "1002-858-162652";
        owner = "백";
        balance = 0;
    }

    BankAccount(double deposit){

        accountNumber = "1002-858-162652";
        owner = "백";
        balance = 0;
    }

    void Deposit(double deposit){
        double temp = balance;
        balance += deposit;
        System.out.println("잔액이");
    }




}
