package com.zpy.practice.test;

/**
 * @author Zhang Pengyu
 * @description 线程代码块同步
 * @date 2024/4/14 10:21
 * @since JDK 1.8
 **/
public class ThreadSyn implements Runnable {
    private static int count = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSyn threadSyn = new ThreadSyn();
        Thread t1 = new Thread(threadSyn);
        Thread t2 = new Thread(threadSyn);
        t1.start();
        t2.start();
    }
}
