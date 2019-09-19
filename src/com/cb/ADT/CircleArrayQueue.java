package com.cb.ADT;

/**
 * @author Politeness Chen
 * @create 2019--06--12  21:50
 */
public class CircleArrayQueue {
    private int maxSize;
    private int front; //队列头,指向队列的第一个元素
    private int rear;  //队列尾，指向队列的最后一个元素的后一个位置
    private int[] arr;  //模拟队列

    public CircleArrayQueue(int max) {
        maxSize = max;
        arr = new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
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
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    //出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        //先把front对应的值保留到一个临时变量
        //将front后移
        int val = arr[front];
        front = (front + 1) % maxSize;
        return val;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空，没有数据");
            return;
        }

        for (int i = front; i < front + size() ; i++) {
//            System.out.print("arr[%d]=%d\n",i % maxSize,arr[i] % maxSize);
        }
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        return arr[front];
    }
}
