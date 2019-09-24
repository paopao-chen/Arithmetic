package com.cb.sort;

import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--09--24  17:14
 */
public class InsertSort {
    public static void main(String[] args) {

    }

    private static void insertSort(int[] num){
        if (num.length < 1)
            return;
        for (int i = 1; i < num.length; i++) {
            int val = num[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if (num[j] > val) {
                    num[j+1] = num[j];
                } else {
                    break;
                }
            }
            num[j+1] = val;
        }

    }

    @Test
    public void t(){
        int[] num = {5,2,1,3,4};
        insertSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
