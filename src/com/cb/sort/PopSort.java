package com.cb.sort;

import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--09--22  17:43
 */
public class PopSort {
    public static void main(String[] args) {

    }

    private static void popSort(int[] num){
        int n = num.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 1; j < n-i; j++) {
                if (num[j-1] > num[j]) {
                    int temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

    }

    @Test
    public void t(){
        int[] num = {5,2,1,3,4};
        popSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
