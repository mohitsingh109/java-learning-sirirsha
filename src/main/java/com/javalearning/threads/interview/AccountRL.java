package com.javalearning.threads.interview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Approach 1: using object level locking
public class AccountRL {

    private int balance;
    private Lock lock = new ReentrantLock();

    public AccountRL(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    //deposit()
    public void deposit(int amount) {
        balance += amount;
    }

    //withdraw()
    public void withdraw(int amount) {
        balance -= amount;
    }

    public Lock getLock() {
        return lock;
    }

    //transfer(from, to)
    public static boolean transferWithoutDeadLock(AccountRL from, AccountRL to, int amount) {
       if(from.getLock().tryLock() && to.getLock().tryLock()) {
           try {
               if(from.getBalance() >= amount) {
                   from.withdraw(amount);
                   to.deposit(amount);
                   System.out.println("Transfer Amount: "+ amount);
               } else {
                   System.out.println("Insufficient balance in Account "+ from.getBalance());
               }
           } finally {
               from.getLock().unlock();
               to.getLock().unlock();
           }
       } else {
           System.out.println("Could not acquire locks for the transfer, try again later");
           return false;
       }
       return true;
    }

    public static void main(String[] args) throws InterruptedException {
        AccountRL account1 = new AccountRL(1000);
        AccountRL account2 = new AccountRL(1000);

        Thread t1 = new Thread(() -> {
            for(int i = 0 ; i < 5; i++) { // try upto 5 times
                boolean result = AccountRL.transferWithoutDeadLock(account1, account2, 300);// account1 -300, account2 + 300
                if(result) { // successfully
                    break; // for loop break
                } else {
                    System.out.println("Retry transaction from account1 to account2");
                    try {
                        Thread.sleep(200); // try after 200 ms
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                boolean result = AccountRL.transferWithoutDeadLock(account2, account1, 200); // account2 - 200, account1 + 200
                if(result) { // successfully
                    break; // for loop break
                } else {
                    System.out.println("Retry transaction from account2 to account1");
                    try {
                        Thread.sleep(200); // try after 200 ms
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Balance of Account 1: " + account1.getBalance()); // 900
        System.out.println("Final Balance of Account 2: " + account2.getBalance()); // 1100
    }

}
