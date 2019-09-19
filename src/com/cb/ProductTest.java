package com.cb;

/**
 *
 * 生产者-消费者问题
 *
 * @author Politeness Chen
 * @create 2019--04--24  14:53
 */
class Clerk{

    private int productCount = 0;
    //生产产品
    public synchronized void produceProduct() {
        if (productCount < 20){
            productCount ++;
            System.out.println(Thread.currentThread().getName()+":开始生产第："+productCount+"个产品。");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费产品
    public synchronized void comsumeProduct() {
        if (productCount > 0){
            System.out.println(Thread.currentThread().getName()+":开始消费第："+productCount+"个产品。");
            productCount --;
            notify();
        } else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Producer extends  Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "：开始生产产品.....");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }

}

class Comsumer extends Thread{
    private Clerk clerk;

    public Comsumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(getName() + "：开始消费产品.....");
        while (true){
            try {
                Thread.sleep(10);
             } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.comsumeProduct();
        }
    }

}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Comsumer c1 = new Comsumer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();
    }
}
