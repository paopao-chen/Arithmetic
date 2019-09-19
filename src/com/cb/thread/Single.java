package com.cb.thread;

/**
 * @author Politeness Chen
 * @create 2019--04--24  16:21
 *
 * 线程安全的单例模式
 */
class Bank{
    private Bank(){}
    private volatile static Bank instance = null;
    private static Bank getInstance(){
        if (instance == null){
            synchronized(Bank.class){
                if (instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
