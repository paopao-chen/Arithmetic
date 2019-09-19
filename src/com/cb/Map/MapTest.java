package com.cb.Map;

import org.junit.Test;

import java.util.*;

/**
 * @author Politeness Chen
 * @create 2019--04--28  14:05
 */
public class MapTest {

    @Test
    public void test(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,1234);
        map.put("BB",56);

        //遍历所有key集，keyset()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------------------");

        //遍历所有的value
        Collection collection = map.values();
        for (Object o : collection) {
            System.out.println(o);
        }

        System.out.println("-------------------");

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            //System.out.println(iterator1.next());
            Object o = iterator1.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "------>" + entry.getValue());
        }
    }
}
