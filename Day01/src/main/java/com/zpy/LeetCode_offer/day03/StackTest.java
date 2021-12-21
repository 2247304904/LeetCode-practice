package com.zpy.LeetCode_offer.day03;

import java.util.Stack;

/**
 * Stack有关方法的使用测试
 *
 * @author 张鹏宇
 * @date 2021/12/07 17:14
 **/

public class StackTest {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackTest() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }


    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        for (int i = 0; i < 6; i++) {
            stackTest.stack1.push(i);

        }

        System.out.println("stack1:"+stackTest.stack1.toString());

        for (int i = 0; i < 6; i++) {

            stackTest.stack2.push(stackTest.stack1.pop());
        }
        System.out.println("stack2:"+stackTest.stack2.toString());


        for (int i = 0; i < 6; i++) {

            stackTest.stack1.push(stackTest.stack2.pop());
        }
        System.out.println("stack1:"+stackTest.stack1.toString());
    }
}
