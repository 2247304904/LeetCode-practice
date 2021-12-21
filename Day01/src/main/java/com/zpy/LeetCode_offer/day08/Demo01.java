package com.zpy.LeetCode_offer.day08;

/**
 * 剑指 Offer II 001. 整数除法
 * https://leetcode-cn.com/problems/xoh6Oh/
 *
 * @author 张鹏宇
 * @date 2021/12/18 14:00
 **/

public class Demo01 {


    public int divide(int a, int b) {
        int flag = 0;
        if (a > 0) {
            a = -a;
            flag += 1;
        }

        if (b > 0) {
            b = -b;
            flag += 1;
        }
        int ret = calc(a, b);
        if (flag != 1 && ret == Integer.MIN_VALUE) {
            ret++;
        }
        return flag == 1 ? ret : -ret;
    }

    private int calc(int a, int b) {
        int ret = 0;
        while (a <= b) {
            int cnt = 1;
            int val = b;
            while (val >= Integer.MIN_VALUE >> 1 && a <= val << 1) {
                cnt += cnt;
                val += val;
            }
            ret -= cnt;
            a -= val;
        }
        return ret;
    }


    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int divide = demo01.divide(-2147483648, 1);
        System.out.println(divide);
//        LinkedList<Integer>

    }
}
