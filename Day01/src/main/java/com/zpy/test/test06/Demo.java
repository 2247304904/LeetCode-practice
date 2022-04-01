package com.zpy.test.test06;

public class Demo {

    public static void main(String[] args) {
        System.out.println(removeDemo(new int[] {0,1,2,2,3,3,4}));
    }
    static int removeDemo(int[] nums){
        int i,j;
        i=0;
        j=i+1;
        while (j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];

            }else{

                j++;
            }
        }
        return i+1;
    }
}
