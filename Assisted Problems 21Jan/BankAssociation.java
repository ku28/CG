import java.util.ArrayList;
import java.util.List;

class Account {
    private static int nextId = 1;
    private final int id;
    private double balance;
    private final Bank bank;

    public Account(Bank bank) {
        this.id = nextId++;
        this.bank = bank;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public Bank getBank() {
        return bank;
    }
}

class Customer {
    final String name;
    private final List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getId() + " at " + acc.getBank().getName() + ": $" + acc.getBalance());
        }
    }
}

class Bank {
    private final String name;
    private final List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void openAccount(Customer customer) {
        Account account = new Account(this);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.name + " at " + name);
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Bank of Java");
        Bank bank2 = new Bank("Code Bank");

        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        bank1.openAccount(alice);
        bank1.openAccount(bob);
        bank2.openAccount(alice); // Alice has accounts in two banks

        alice.viewBalance();
        bob.viewBalance();
    }
}
