package com.zpy.daily;

/**
 * 1154. 一年中的第几天
 * https://leetcode-cn.com/problems/day-of-the-year/
 *
 * @author 张鹏宇
 * @date 2021/12/21 10:01
 **/

public class Demo01 {
    public int dayOfYear(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int mouth = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        int[] run = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] ping = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            for(int i = 0 ;i<mouth-1;i++){
                day +=run[i];
            }
        }else {
            for(int i = 0 ;i<mouth-1;i++){
                day +=ping[i];
            }

        }

        return day;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int i = demo01.dayOfYear("2000-03-01");
        System.out.println(i);
    }
}
