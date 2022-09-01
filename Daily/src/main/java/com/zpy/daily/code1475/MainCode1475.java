package com.zpy.daily.code1475;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode-practice
 * @description: 每日一题 1475
 * https://leetcode.cn/problems/final-prices-with-a-special-discount-in-a-shop/
 * @author: 张鹏宇
 * @create: 2022-09-01 23:24
 **/

public class MainCode1475 {

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? prices[i] : prices[i] - stack.peek();
            stack.push(prices[i]);
        }
        return ans;
    }

}
