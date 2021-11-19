package com.zpy.sort;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int min = 0;
        int temp = 0;
        int a[] = new int[10];
        for (int i = 0, j = a.length; i < a.length; i++, j--) {
            a[i] = j;
        }

        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;

                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
