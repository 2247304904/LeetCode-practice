package com.zpy.practice.test;

import java.util.concurrent.CountDownLatch;

/**
 * @author Zhang Pengyu
 * @description https://cloud.tencent.com/developer/article/1801558
 * @date 2024/6/19 11:39
 * @since JDK 1.8
 **/
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                try {
                    //所有请求都阻塞在这，等待
                    countDownLatch.await();
                    // 调用测试接口
                    System.out.println(Thread.currentThread().getName() + "开始执行……");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        // 让请求都准备好
        Thread.sleep(2000);
        // 让所有请求统一请求
        countDownLatch.countDown();
    }
}
