package com.cb.Map;

import org.junit.Test;

import java.util.*;

/**
 * @author Politeness Chen
 * @create 2019--04--28  14:22
 */
public class TreeMapeTest {
    //自然排序
    @Test
    public void test(){
        TreeMap map = new TreeMap();

        User u1 = new User("Tom",11);
        User u2 = new User("Team",30);
        User u3 = new User("John",23);
        User u4 = new User("Jerry",18);

        map.put(u1,11);
        map.put(u2,11);
        map.put(u3,22);
        map.put(u4,33);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "------>" + entry.getValue());
        }
    }

    //定制排序
    @Test
    public void test2(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                } else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        });

        User u1 = new User("Tom",11);
        User u2 = new User("Team",30);
        User u3 = new User("John",23);
        User u4 = new User("Jerry",18);

        map.put(u1,11);
        map.put(u2,11);
        map.put(u3,22);
        map.put(u4,33);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "------>" + entry.getValue());
        }
    }
}
