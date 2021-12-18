package com.zpy.day08;

/**
 * 剑指 Offer II 001. 整数除法
 * https://leetcode-cn.com/problems/xoh6Oh/
 *
 * @author 张鹏宇
 * @date 2021/12/18 14:00
 **/

public class Demo01 {
    public int divide(int a, int b) {
        int index = 0;
        int aabs = Math.abs(a);
        int babs = Math.abs(b);
        if (aabs >= babs) {
            while (true) {
                if (aabs - babs >= 0) {
                    aabs -= babs;
                    index++;
                } else {
                    break;
                }
            }
        }
        if (Math.min(a, b) > 0 || (a < 0 && b < 0)) {

        } else {
            index = 0 - index;
        }
        return index;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int divide = demo01.divide(-2147483648, -1);
        System.out.println(divide);
    }
}
