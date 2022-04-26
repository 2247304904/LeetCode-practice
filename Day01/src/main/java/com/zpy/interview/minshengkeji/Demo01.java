package com.zpy.interview.minshengkeji;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode-practice
 * @description: 民生科技笔试题01
 * @author: 张鹏宇
 * @create: 2022-04-17 15:31
 **/

public class Demo01 {

    public int answerSheet(String s, String t) {
        // write code here

        Map<String, String> map = new HashMap<>();

        map.put("1000", "A");
        map.put("0100", "B");
        map.put("0010", "C");
        map.put("0001", "D");

        char[] chars = s.toCharArray();
        String temp = "";
        char[] chars1 = t.toCharArray();
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            temp += chars[i];
            if ((i + 1) % 4 == 0) {
                String s1 = map.get(temp);
                if(s1 != null){
                    if(s1.equals((chars1[(i + 1) / 4-1])+"")){
                        score++;
                    }

                }
                temp = "";
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int i = demo01.answerSheet("100001000101", "ABC");
        System.out.println(i);
    }
}
