package com.cb.ADT;

/**
 * @author Politeness Chen
 * @create 2019--06--12  21:26
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {

    }

}

class ArrayQueue {
    private int maxSize;
    private int front; //队列头
    private int rear;  //队列尾
    private int[] arr;

    public ArrayQueue(int max) {
        maxSize = max;
        arr = new int[maxSize];
        front = -1;  //指向队列头的前一个位置
        rear = -1;   //指向队列尾补的数据
    }

    //判断队列是否满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断队列是否空
    public boolean isEmpty() {
        return rear == front;
    }

    //进队列
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满不能加入数据");
            return;
        }
        rear ++;  //让rear后移
        arr[rear] = n;
    }

    //出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        front ++;
        return arr[front];
    }

    //显示队列数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println();
        }
    }

    //显示头部的数据
    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        return arr[front + 1];
    }
}