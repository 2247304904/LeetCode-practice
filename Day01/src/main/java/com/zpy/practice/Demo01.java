package com.zpy.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,6,3,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> integerList= new ArrayList<Integer>();
        for(int i =0;i<10;i++){
            integerList.add(i);
        }
        Collections.sort(integerList);
        Collections.reverse(integerList);
        for (Integer integer : integerList) {
            System.out.println(integer);

        }
    }
}
