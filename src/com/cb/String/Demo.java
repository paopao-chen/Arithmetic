package com.cb.String;

import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--04--25  13:31
 */
public class Demo {
    /*
    将一个字符串进行反转。将字符串中指定的部分进行反转。
    比如："abcdefg"反转为"abfedcg"

     */
    //方式一：转换为char[]
    public String reverse(String str,int startIndex,int endIndex){

        if (str != null){
            char[] arr = str.toCharArray();
            for (int x = startIndex,y = endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //方式二：使用String的拼接
    public String reverse2(String str,int startIndex,int endIndex){
        String reverseStr = str.substring(0,startIndex);
        for (int i = endIndex; i >= startIndex; i--) {
            reverseStr += str.charAt(i);
        }
        reverseStr += str.substring(endIndex + 1);
        return reverseStr;
    }

    //方式三：使用StringBuffer/StringBuilder替换String
    public String reverse3(String str,int startIndex,int endIndex){
        StringBuilder builder = new StringBuilder(str.length());
        builder.append(str.substring(0,startIndex));
        for (int i = endIndex; i >= startIndex; i--) {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(endIndex + 1));
        return builder.toString();
    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse3(str, 2, 5);
        System.out.println(reverse);
    }
}
