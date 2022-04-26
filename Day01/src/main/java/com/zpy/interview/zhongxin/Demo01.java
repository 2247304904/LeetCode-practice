package com.zpy.interview.zhongxin;

import java.util.Scanner;

/**
 * @program: LeetCode-practice
 * @description: 中信信用卡笔试题01
 * @author: 张鹏宇
 * @create: 2022-04-26 16:52
 **/

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        String res = "";
        for (char aChar : chars) {
            if(aChar =='A'||aChar=='a'
                    ||aChar =='E'||aChar=='e'
                    ||aChar =='I'||aChar=='i'
                    ||aChar =='O'||aChar=='o'
                    ||aChar =='U'||aChar=='u'){
                res+=Character.toLowerCase(aChar);
            }else {
                res+=Character.toUpperCase(aChar);
            }
        }
        System.out.println(res);
    }
}
