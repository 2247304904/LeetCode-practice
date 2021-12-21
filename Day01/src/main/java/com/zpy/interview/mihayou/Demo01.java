package com.zpy.interview.mihayou;

import java.util.Arrays;

public class Demo01 {


    public int findKthLargest(int[] nums, int k) {
        // write code here


        int index = 0;
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]&&nums[j]>nums[index]) {
                    index = j;
                }
            }
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
        return nums[k - 1];
    }

    public static void main(String[] args) {
        int nums[] = new int[]{3, 2, 1, 5, 6, 4};
        Demo01 demo01 = new Demo01();
        int kthLargest = demo01.findKthLargest(nums, 2);
        System.out.println(kthLargest);
    }
}
