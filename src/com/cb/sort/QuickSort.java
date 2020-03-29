package com.cb.sort;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author Politeness Chen
 * @create 2019--09--21  14:20
 */
public class QuickSort {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int[] num = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            num[i] = Integer.parseInt(s[i]);
        }
        System.out.println(quickSort(num,0,num.length-1));*/
    }

    private static void quickSort(int[] num,int left,int right) {
        if (left > right)
            return;
        int i = left;
        int j = right;
        int temp = num[left];
        while (i < j) {  //不止交换一次
            while (i < j && num[j] <= temp) {
                j --;
            }
            while (i < j && num[i] >= temp) {
                i ++;
            }
            if (i < j) {
                int swap = num[i];
                num[i] = num[j];
                num[j] = swap;
            }
        }
        num[left] = num[i];
        num[i] = temp;
        quickSort(num,left,i-1);
        quickSort(num,i+1,right);
    }

    @Test
    public void t(){
        int[] num = {0,0,1,2,4,2,2,3,1,4,8};
        quickSort(num,0,num.length-1);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
