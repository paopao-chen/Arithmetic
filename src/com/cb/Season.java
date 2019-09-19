package com.cb;

/**
 * @author Politeness Chen
 * @create 2019--09--07  18:14
 */
public class Season {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        //toString()
        System.out.println(summer);

//        System.out.println(Season1.class.getSuperclass());

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }


    }
}

interface Info{
    void show();
}

enum Season1 implements Info {

    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    private final String name;
    private final String desc;

    private Season1(String name1, String desc1) {
        this.name = name1;
        this.desc = desc1;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("但愿一年四季都可以见到你");
    }
}
