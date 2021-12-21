package com.zpy.LeetCode_offer.day06;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/15 09:43
 **/

public class Demo02 {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                start = i;
            }
            if (nums[i] > target) {
                end = i;
                break;
            }

        }
        return end - start-1;
    }

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int search = demo02.search(nums, target);
        System.out.println(search);
    }
}
