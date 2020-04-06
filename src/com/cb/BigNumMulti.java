package com.cb;

/**
 * @author Politeness Chen
 * @create 2020--04--06  22:23
 *
 * 大数想乘
 */
public class BigNumMulti {
    private String bigNum(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (str1.length() == 0 || str2.length() == 0) {
            return "0";
        }
        int[] res = new int[len1 + len2];// 模拟一下就知道最大不会超过两个数的长度
        for (int i = 0; i < len1; i++) {
            int num1 = str1.charAt(i) - '0';
            for (int j = 0; j < len2; j++) {
                int num2 = str2.charAt(j) - '0';
                res[i+j] += num1 * num2;// 想乘的特点，对位的i+j是一样的
            }
        }
        for (int i = res.length - 1; i > 0; i--) {
            if (res[i] >= 10) {
                res[i-1] += res[i] / 10;
                res[i] %= 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = res.length - 1;
        for (; i >=0 && res[i] == 0; i--) {// 去掉开始的0
        }
        for (; i >=0; i--) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
