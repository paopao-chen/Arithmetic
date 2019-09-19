package com.cb.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Politeness Chen
 * @create 2019--04--24  15:33
 *
 *
 * 线程池
 */
class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new NumberThread());//适合用于Runnable
//        service.submit();//适合用于Callable
    }
}
