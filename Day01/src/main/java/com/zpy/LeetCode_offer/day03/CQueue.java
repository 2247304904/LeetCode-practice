package com.zpy.LeetCode_offer.day03;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/07 15:32
 **/

public class CQueue {
    private Stack<Integer> stack1;//操作栈
    private Stack<Integer> stack2;//辅助栈

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();

    }

    public void appendTail(int value) {
        stack1.push(value);


    }

    public int deleteHead() {
        int res = 0;
        if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            res = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

        } else {
            res = -1;
        }
        return res;

    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(3);
        cQueue.appendTail(4);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
