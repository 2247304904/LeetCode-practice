package com.zpy.leetcode;

/**
 * @program: LeetCode-practice
 * @description: 力扣 1143 最长公共子序列
 * @author: 张鹏宇
 * @create: 2022-04-26 20:46
 **/

public class Demo01 {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length()+1;
        int m = text2.length()+1;
        int[][] dp = new int[n][m];
        for (int i = 1; i < n; i++) {
            char char1 = text1.charAt(i-1);
            for (int j = 1; j < m; j++) {
                char char2= text2.charAt(j-1) ;
                if(char1 == char2){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        Demo01 demo = new Demo01();
        int i = demo.longestCommonSubsequence("abcde", "ace");
        System.out.println(i);
    }
}
