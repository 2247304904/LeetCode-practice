package com.zpy.daily;

/**
 * @program: LeetCode-practice
 * @description: 1470 重新排列数组
 * https://leetcode.cn/problems/shuffle-the-array/
 * @author: 张鹏宇
 * @create: 2022-08-29 23:11
 **/

public class Demo02 {


    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }


}
