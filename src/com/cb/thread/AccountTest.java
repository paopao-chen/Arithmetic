package com.cb.thread;

/**
 * @author Politeness Chen
 * @create 2019--04--24  13:44
 */
class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    //存钱
    public synchronized void deposit(double amt){
        if (amt > 0){
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":存钱成功，余额为：" + balance);
        }
    }
}
class Customer extends Thread{
    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer customer1 = new Customer(acct);
        Customer customer2 = new Customer(acct);

        customer1.setName("甲");
        customer2.setName("乙");

        customer1.start();
        customer2.start();
    }
}
