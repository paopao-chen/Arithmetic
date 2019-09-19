package com.cb.thread;

/**
 * @author Politeness Chen
 * @create 2019--04--24  14:12
 *
 *
 * sleep()和wait()的异同？
 *
 */
class Number implements Runnable{

    private int number = 1;
    @Override
    public void run() {

        while (true){

            synchronized (this) { //ctrl+alt+t快速包起来方法
                notify();
                if (number <= 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number ++;

                    try {
                        //使得调用如下wait（）方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }

        }
    }
}

public class Communication{
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}