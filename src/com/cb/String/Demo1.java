package com.cb.String;

import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--04--25  13:48
 */
public class Demo1 {
    /*
    获取一个字符串在拎一个字符串中出现的次数。
    比如：获取"ab"在"abkkcadkabkebfkaabkskab"中痴线的次数
     */
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength){
            //方式一：
//            while ((index = mainStr.indexOf(subStr)) != -1){
//                count ++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }

            //方式二：
                while ((index = mainStr.indexOf(subStr,index)) != -1){
                    count ++;
                    index += subLength;
                }
            return count;
        } else {
            return 0;
        }
    }

    @Test
    public void testGetCount(){
        String mainStr = "abkkcadkabkebfkaabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }
}
