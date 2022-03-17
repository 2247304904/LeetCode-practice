package com.zpy.test.test02;

import java.util.Arrays;

public class Test02 {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     * <p>
     * <p>
     * 找到数组中乘积最大的连续子数组，并返回乘积
     *
     * @param nums long长整型 一维数组 原始数组
     * @return long长整型
     */
    public long GetSubArrayMaxProduct(long[] nums) {
        // write code here
        int length = nums.length;
        long [] maxF = new long[length];
        long [] minF = new long[length];
        System.arraycopy(nums, 0,maxF,0,length);
        System.arraycopy(nums, 0,minF,0,length);
        for(int i = 1;i<length;i++){
            maxF[i] = Math.max(maxF[i-1]*nums[i],Math.max(nums[i],minF[i-1]*nums[i]));
            minF[i] = Math.min(maxF[i-1]*nums[i],Math.min(nums[i],maxF[i-1]*nums[i]));
        }
        long index = maxF[0];
        for(int i =1;i<length;++i){
            index = Math.max(index,maxF[i]);
        }
        return index;
    }

    public static void main(String[] args) {
        Test02 test = new Test02();
        long[] nums = {2, 3, -2, 4, -1,-3};
        long l = test.GetSubArrayMaxProduct(nums);
        System.out.println(l);
    }
}
