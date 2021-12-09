package com.zpy.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * 瓜子二手车手撕题目
 * 判断括号是否全匹配
 * 利用栈 左边括号入栈 右侧括号则不入栈
 *
 * @author 张鹏宇
 * @date 2021/12/08 20:07
 **/

public class Test02 {


    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!stack.isEmpty()) {
                if (chars[i] == '{' || chars[i] == '(' || chars[i] == '[') {
                    stack.push(chars[i]);
                } else {
                    if (stack.peek().equals('{') && chars[i] == '}') {
                        System.out.println(stack.pop());
                        continue;
                    }
                    if (stack.peek().equals('[') && chars[i] == ']') {
                        System.out.println(stack.pop());
                        continue;
                    }
                    if (stack.peek().equals('(') && chars[i] == ')') {
                        System.out.println(stack.pop());
                        continue;
                    }
                }
            } else {
                stack.push(chars[i]);
            }
        }

        if(stack.isEmpty()){
            System.out.println("全匹配");

        }else {
            System.out.println("不全匹配");
            System.out.println(stack.toString());
        }
    }
}
