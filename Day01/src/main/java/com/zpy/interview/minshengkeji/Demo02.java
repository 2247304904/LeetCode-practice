package com.zpy.interview.minshengkeji;

/**
 * @program: LeetCode-practice
 * @description: 民生科技笔试题02
 * @author: 张鹏宇
 * @create: 2022-04-17 15:58
 **/

public class Demo02 {

    public int antiNumber(int x) {
        // write code here
        int num=1;
        while (num < x){
            num=(num<<1)+1;

        }
        return num ^x;
    }

    public static void main(String[] args) {
        Demo02 demo = new Demo02();
        int i = demo.antiNumber(10);
        System.out.println(i);

    }
}
