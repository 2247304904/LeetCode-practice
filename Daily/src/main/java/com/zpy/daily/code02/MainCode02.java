package com.zpy.daily.code02;

/**
 * @author Zhang Pengyu
 * @description 力扣 53. 最大子数组和
 * https://leetcode.cn/problems/maximum-subarray/
 * @date 2022/8/31 20:40
 * @since JDK 1.8
 **/
public class MainCode02 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        // base case
        // 第一个元素前面没有子数组
        dp[0] = nums[0];
        // 状态转移方程
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        // 得到 nums 的最大子数组
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
