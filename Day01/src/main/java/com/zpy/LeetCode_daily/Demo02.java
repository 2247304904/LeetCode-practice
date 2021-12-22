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
        int res = 0;
        String temp = "";
        char[] chars = b.toCharArray();
//        while (true) {
//            if(temp.length()>b.length()*2+a.length()){
//                res = -1;
//                break;
//            }else {
//                if (temp.indexOf(b) != -1) {
//                    break;
//                } else {
//                    temp += a;
//                    res++;
//                }
//            }
//
//
//        }
        while(true){
            if (temp.length() >= b.length() && temp.length() <= b.length() * 2 + a.length()){
                if (temp.indexOf(b) != -1) {
                    break;
                } else {
                    temp += a;
                    res++;
                }
                if (temp.indexOf(b) != -1) {
                    break;
                } else {
                    temp += a;
                    res++;
                }
            }
            else{
                res = -1;
                break;

            }
        }



            return res;
    }

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        int i = demo02.repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab"
                , "ba");
        System.out.println(i);
    }
}
