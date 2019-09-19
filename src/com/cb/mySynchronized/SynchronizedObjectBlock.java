package com.cb.mySynchronized;

/**
 * @author Politeness Chen
 * @create 2019--09--03  9:29
 */
public class SynchronizedObjectBlock implements Runnable{

    static SynchronizedObjectBlock instance = new SynchronizedObjectBlock();

    Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("我是"+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {

        }
        System.out.println("finish");
    }
}
