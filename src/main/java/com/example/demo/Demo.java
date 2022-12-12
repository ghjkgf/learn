package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zsl
 * @date 2022/12/7
 * @apiNote
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            final int temp = i;
            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + ", " + temp));
        }
    }

    @Test
    public void test1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DATE, 4);
        calendar.set(Calendar.YEAR, 2018);
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
