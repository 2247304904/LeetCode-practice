package com.zpy.test.test06;

import java.util.Arrays;

/**
 * @program: LeetCode-practice
 * @description: 太平洋保险测试题
 * @author: 张鹏宇
 * @create: 2022-04-10 18:59
 **/

public class Demo03 {
    public int getMaxLength(int[] arr) {
        // write code here
        int i = 0, j = 1;
        int temp = 0;
        if (arr.length <2){
            return arr.length;
        }else {
            Arrays.sort(arr);
            while (j<arr.length){
                if(arr[i]<arr[j]){
                    i++;
                    arr[i]=arr[j];
                    j++;
                }else {
                    j++;
                }

            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Demo03 demo = new Demo03();
        int maxLength = demo.getMaxLength(new int[]{1, 2, 3, 1, 2, 3, 2, 2});
        System.out.println(maxLength);
    }
}
