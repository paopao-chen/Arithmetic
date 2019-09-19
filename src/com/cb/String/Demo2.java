package com.cb.String;

import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--04--25  14:31
 */
public class Demo2 {
    /*
    获取两个字符串中的最大相同子串，比如：
    str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"
    将短的那个串进行长度依次递减的子串与较长的串比较。
     */
    public String getMaxSameString(String str1,String str2){
        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        int length = minStr.length();
        for (int i = 0; i < length; i ++){
            for (int x = 0,y = length - i;y <= length;x ++,y ++){
                String subStr = minStr.substring(x,y);
                if (maxStr.contains(subStr)){
                    return subStr;
                }
            }
        }

        return null;
    }

    @Test
    public void testGetMaxSameString(){
        String str1 = "abcwerthello1yuiodef";
        String str2 = "cvhello1bnm";
        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);
    }
}
