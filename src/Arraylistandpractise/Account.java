package Arraylistandpractise;

import java.util.Scanner;

public class Account {
    String accname;
    int accno;
    double amount;

    public void withdraw(double withdraw){
        if(withdraw > amount){
            System.out.println("insuffircient balance");
        }
        else {
            amount = amount - withdraw;
            System.out.println(amount);
        }
    }
    public void deposit(double depsoitamount){
        amount = amount + depsoitamount;
        System.out.println(amount);
    }
    public void interset(double rate){
        double interset = (amount * rate)/ 100;
        amount = amount + interset;
        System.out.println(amount);

    }
    public static void main(String args[]){

        Account ac = new Account();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account number");
        ac.accno = sc.nextInt();

        System.out.println("enter the account name");
        ac.accname = sc.next();

        System.out.println("enter the amount");
        ac.amount = sc.nextDouble();

        System.out.println("enter the withdrawal amount");
        double withdraw = sc.nextDouble();
        ac.withdraw(withdraw);

        System.out.println("enter deposit amount");
        double depositamount = sc.nextDouble();
        ac.deposit(depositamount);

        System.out.println("enter the rate");
        double intersetrate = sc.nextDouble();
        ac.interset(intersetrate);

    }
}
