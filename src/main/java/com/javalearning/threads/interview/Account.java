package com.javalearning.threads.interview;

// Approach 1: using object level locking
public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    //deposit()
    public synchronized void deposit(int amount) {
        balance += amount; // balance = balance + amount
    }

    //withdraw()
    public synchronized void withdraw(int amount) {
        balance -= amount;
    }

    //transfer(from, to)
    public static void transfer(Account from, Account to, int amount) { // T1, T2, T3, T4
        // lock
        synchronized (from) { // T1 T2 lock the from object
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (to) { // T1 lock the to
                if(from.getBalance() >= amount) {
                    from.withdraw(amount); // -
                    to.deposit(amount); // +
                    System.out.println("Transfer Amount: "+ amount);
                } else {
                    System.out.println("Insufficient balance in Account "+ from.getBalance());
                }
            }
        }
        //unlock
    }

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(1000);
        Account account2 = new Account(1000);

        Thread t1 = new Thread(() -> {
            Account.transfer(account1, account2, 300); // account1 -300, account2 + 300
        });

        Thread t2 = new Thread(() -> {
            Account.transfer(account2, account1, 200); // account2 - 200, account1 + 200
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Balance of Account 1: " + account1.getBalance()); // 900
        System.out.println("Final Balance of Account 2: " + account2.getBalance()); // 1100
    }

}
