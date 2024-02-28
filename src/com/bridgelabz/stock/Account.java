package com.bridgelabz.stock;

class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited: $" + amount);
        } else {
            System.out.println("Credit amount must be greater than 0.");
        }
    }

    public void debit(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Debited: $" + amount);
            } else {
                System.out.println("Debit amount exceeded account balance.");
            }
        } else {
            System.out.println("Debit amount must be greater than 0.");
        }
    }
}
