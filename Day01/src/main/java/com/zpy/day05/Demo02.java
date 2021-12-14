package com.zpy.day05;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/14 18:30
 **/

public class Demo02 {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        String res = "";
        for (int i = n; i < chars.length; i++) {
            res += chars[i];

        }
        for (int i = 0; i < n; i++) {
            res += chars[i];
        }
        return res;
    }
}
