package com.cb.ADT;

import java.util.*;

/**
 * @author Politeness Chen
 * @create 2019--09--23  19:40
 *
 * 34839946-beijing 34839946-shanghai 42342124-hongkong 42342124-guilin 42342124-guilin 12312344-shanghai 12312344-shanghai 22341234-nanjing
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (!list.contains(s[i])) {
                list.add(s[i]);
                city.add(s[i].substring(9));
            }
        }
        List<String> list1 = city1(city);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
    }

    private static List<String> city1(ArrayList<String> list){

        LinkedList<String> city = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            int count = 1;
            for (int j = i+1; j < list.size(); j++) {
                if (temp.equals(list.get(j))) {
                    list.remove(j);
                    count ++;
                }
            }
            city.add(list.get(i)+ " " +count);
        }
        Collections.sort(city, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.charAt(o1.length()-1) < (o2.charAt(o2.length()-1))) return 1;
                else if (o1.charAt(o1.length()-1) == (o2.charAt(o2.length()-1))) return o1.compareTo(o2);
                else return -1;
            }
        });
        return city;
    }
}
