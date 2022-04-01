package com.zpy.test.test05;

public class Demo01 {
    public int solution(int[] prices, int pocket) {
        // 在这⾥写代码
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(i+j<pocket){
                    result++;
                }
            }
        }

        return result;
    }
}
