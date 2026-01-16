

import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            BankAccount acc = new BankAccount();
            sc.nextLine();
            sc.nextInt();
            acc.balance = sc.nextDouble();

            acc.deposit(2000);
            acc.withdraw(1500);
            acc.displayBalance();
        }
    }
}

