package com.cb;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Politeness Chen
 * @create 2019--09--04  20:57
 */
public class minStep {
    /*public int aTob(int a, int b) {
        Queue<Integer> que = new LinkedList<>();
        int flag[] = new int[0x8000];
        int step = 0;
        que.add(a);
        while (!que.isEmpty()) {
            int n = que.size();
            for (int i = 0; i < n; i++) {
                int val = que.peek();
                que.poll();
                if (flag[val] == 1) continue;
                if (val == b) {
                    return step;
                }
                que.add(val-1);
                que.add(val+1);
                que.add(val*2);
                flag[val] = 1;
            }
            step ++;
        }
        return step;
    }

    public int s(int a, int b) {
        if (a < 0 && b < 0)
            return aTob(0-a,0-b);
        else
            return aTob(a,b);
    }*/

    public int aTob(int a, int b) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);
        int step = 0;
        List<Integer> list = new LinkedList<>();
        int[] flag = new int[0x8000];
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int value = queue.peek();
                queue.poll();
                if (flag[value] == 1) continue;
                if (value == b) {
                    return step;
                }
                queue.offer(value-1);
                queue.offer(value+1);
                queue.offer(value*2);
                flag[value] = 1;
            }
            step ++;
        }
        Collections.sort(list);
        return list.get(0);
    }

    public int s(int a,int b) {
        if (a < 0 && b < 0)
            return aTob(0-a,0-b);
        else
            return aTob(a,b);
    }

    @Test
    public void t(){
        System.out.println(s(2,5));
    }
}
