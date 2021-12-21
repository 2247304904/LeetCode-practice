package com.zpy.leetCode_true.day01;

/**
 * LCP 28. 采购方案
 * https://leetcode-cn.com/problems/4xy4Wx/
 *
 * @author 张鹏宇
 * @date 2021/12/21 13:54
 **/

public class Demo01 {
    public int purchasePlans(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] <= target) {
                    res++;
                }
            }
        }
        return res % 1000000007;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int nums[] = {2, 2, 1, 9};
        int i = demo01.purchasePlans(nums, 10);
        System.out.println(i);
    }
}
