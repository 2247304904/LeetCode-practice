package com.zpy.LeetCode_offer.day05;

/**
 * 剑指 Offer 05. 替换空格
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @author 张鹏宇
 * @date 2021/12/13 13:50
 **/

public class Demo01 {
    public String replaceSpace(String s) {

        String s2 = s.replaceAll(" ", "%20");
        return s2;
    }
}
