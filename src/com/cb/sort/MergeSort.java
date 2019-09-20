package com.cb.sort;

import java.util.Scanner;

/**
 * @author Politeness Chen
 * @create 2019--09--20  15:02
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int[] num = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            num[i] = Integer.parseInt(s[i]);
        }
        System.out.println(mergeSort(num, 0, num.length - 1));
    }

    private static int[] mergeSort(int[] num,int left,int right){
        int mid = (left+right)/2;
        if (left < right) {
            mergeSort(num,left,mid);
            mergeSort(num,mid+1,right);
            merge(num,left,mid,right);
        }
        return num;
    }

    private static void merge(int[] num, int left, int mid, int right) {
        int[] arr = new int[right-left+1];
        int i = left,j = mid+1;
        int m = 0;
        while (i <= mid && j <= right) {
            if (num[i] < num[j]) {
                arr[m++] = num[i++];
            } else {
                arr[m++] = num[j++];
            }
        }
        while (i <= mid) {
            arr[m++] = num[i++];
        }
        while (j <= right) {
            arr[m++] = num[j++];
        }
        for (int k = 0; k < arr.length; k++) {
            num[left+k] = arr[k];
        }
    }
}
