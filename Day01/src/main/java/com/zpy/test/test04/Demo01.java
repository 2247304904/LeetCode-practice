package com.zpy.test.test04;

//26. 删除有序数组中的重复项
//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/

public class Demo01 {
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[fast] > nums[slow]) {


                slow++;
                nums[slow] = nums[fast];
                fast++;

            } else {
                fast++;
            }
        }

        return slow+1;
    }

    public static void main(String[] args) {
        Demo01 demo1 = new Demo01();
        int []nums = {1,1,2};
        int i = demo1.removeDuplicates(nums);
        System.out.println(i);

    }
}
