package com.cb.thread;

/**
 * @author Politeness Chen
 * @create 2019--09--07  11:01
 *
 * start():启动当前线程;调用当前线程的run
 * run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * currentThread():静态方法，返回执行当前代码的线程
 *
 * yield():释放当前cpu的执行权
 * join():在线程A中调用线程B的join(),此时线程A就进入阻塞状态，直到线程B完全执行完以后，线程A才结束阻塞状态
 *
 */
public class MethodTest {
    public static void main(String[] args) {
        HelloThread t = new HelloThread("线程1");
        t.start();

        Thread.currentThread().setName("主线程");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "-----" + i);
            }

            if (i == 20) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "-----" + i);
            }

           /* if (i % 20 == 0) {
                this.yield();
            }*/
        }
    }

    public HelloThread(String name) {
        super(name);
    }
}

