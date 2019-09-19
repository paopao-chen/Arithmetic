package com.cb;

import java.util.Scanner;

/**
 * @author Politeness Chen
 * @create 2019--08--20  19:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(bigNum(a,b));

    }

    public static String bigNum(String a, String b) {
        a = reverse(a);
        b = reverse(b);
        int len1 = a.length();
        int len2 = b.length();
        int len = len1 + len2 + 3;
        int[] nums = new int[len];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                nums[i+j] += Integer.valueOf(String.valueOf(a.charAt(i))) *
                        Integer.valueOf(String.valueOf(b.charAt(j)));
            }
        }

        //把他们进行相加
        for (int i = 0; i < len; i++) {
            int temp = nums[i]/10;
            nums[i] = nums[i]%10;
            if (temp > 0) {
                nums[i+1] += temp;
            }
        }

        int m = len - 1;
        while (nums[m] <= 0) {   //去掉多余的0
            m--;
        }
        String str = "";
        while (m >= 0) {
            str += nums[m];
            m--;
        }
        return str;
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

}