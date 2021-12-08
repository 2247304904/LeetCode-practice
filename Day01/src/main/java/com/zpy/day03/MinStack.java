package com.zpy.day03;


import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 * https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/07 23:49
 **/

public class MinStack {

    private Stack<Integer> stack1;  //操作栈
    private Stack<Integer> stack2;  //辅助栈

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();

    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty()) {
            stack2.push(x);
        } else {
            if (stack2.peek() >=x){
                stack2.push(x);
            }
        }
    }

    public void pop() {
        Integer pop = stack1.pop();
        if(pop.equals(stack2.peek())){
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
