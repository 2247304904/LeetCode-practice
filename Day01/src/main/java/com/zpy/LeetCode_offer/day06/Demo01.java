package com.zpy.LeetCode_offer.day06;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/14 19:41
 **/

public class Demo01 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int res = 0;
        for(int i = 0 ;i<nums.length;i++){
            boolean add = set.add(nums[i]);
            if(!add){
                res = nums[i];
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int[] nums ={1,1,2,3,4};
        int repeatNumber = demo01.findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }

}
