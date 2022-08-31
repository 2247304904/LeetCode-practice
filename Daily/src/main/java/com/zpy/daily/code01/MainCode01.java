package com.zpy.daily.code01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author Zhang Pengyu
 * @description 每日一题 946. 验证栈序列
 * https://leetcode.cn/problems/validate-stack-sequences/
 * @date 2022/8/31 17:46
 * @since JDK 1.8
 **/
public class MainCode01 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
