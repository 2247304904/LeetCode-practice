package com.zpy.leetcode.learn;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode-practice
 * @description: 1. 两数之和
 * @author: 张鹏宇
 * @create: 2022-04-26 21:49
 **/

public class Demo01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
