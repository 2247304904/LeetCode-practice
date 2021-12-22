package com.zpy.LeetCode_daily;

/**
 * 686. 重复叠加字符串匹配
 * https://leetcode-cn.com/problems/repeated-string-match/
 *
 * @author 张鹏宇
 * @date 2021/12/22 09:44
 **/

public class Demo02 {
    public int repeatedStringMatch(String a, String b) {
        int res = 1;
        while (true) {

            if (a.indexOf(b) != -1) {
                break;
            } else {
                res++;
                a += a;
            }
            if(a.length()>b.length()*3){
                res = -1;
                break;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        int i = demo02.repeatedStringMatch("abc", "cabcabca");
        System.out.println(i);
    }
}
