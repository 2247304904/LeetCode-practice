package com.zpy.practice.test;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Zhang Pengyu
 * @description
 * @date 2023/12/26 15:23
 * @since JDK 1.8
 **/
public class AlternatePrint {

    static Thread t1 = null, t2 = null;

    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        t1 = new Thread(() -> {
            for (int i = 0; i < aC.length; i++) {
                // 起始先打印一个字母
                System.out.println(aC[i]);
                // 打印完唤醒t2打印数字
                LockSupport.unpark(t2);
                // 自己阻塞，等待唤醒
                LockSupport.park();
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i < aI.length; i++) {
                // 起始先阻塞等待
                LockSupport.park();
                // 被唤醒后打印数字
                System.out.println(aI[i]);
                // 唤醒t1
                LockSupport.unpark(t1);
            }
        });

        t1.start();
        t2.start();
    }

}