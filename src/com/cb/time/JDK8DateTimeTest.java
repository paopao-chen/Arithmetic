package com.cb.time;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Politeness Chen
 * @create 2019--04--25  20:07
 */
public class JDK8DateTimeTest {

    @Test
    public void testDate(){
        //偏移量
        Date date1 = new Date(2020-1900,9-1,8);
        System.out.println(date1);
    }

    @Test
    public void test1(){
        //now(): 获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年月日时分秒，没有偏移量
        LocalDateTime of = LocalDateTime.of(2020, 10, 6, 13, 43, 43);
        System.out.println(of);

    }

    @Test
    public void t(){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());

        Date date2 = new Date(1563420840626L);
        System.out.println(date2.toString());
    }

    @Test
    public void t2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //日期----->字符串
        Date date = new Date();

        String format = sdf.format(date);
        System.out.println(format);  //2019/7/18 上午11:46(默认格式)

        Date parse = sdf.parse("2019-07-18 11:48:29");
    }

    @Test
    public void t3() {
        Calendar c = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();
    }
}
