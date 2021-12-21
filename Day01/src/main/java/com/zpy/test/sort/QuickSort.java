package com.zpy.test.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    int sort(int arr[], int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        while (true) {

            //向右遍历扫描
            while (i <= j && arr[i] <= pivot) i++;
            //向左遍历扫描
            while (i <= j && arr[j] >= pivot) j--;
            if (i >= j) {
                break;
            }
            //交换
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //把arr[j]和主元交换
        arr[left] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int index = sort(arr, left, right);
            sort(arr, left, index);
            sort(arr, index + 1, right);
        }

    }

    public static void main(String[] args) {
        int sort[] = {4, 1, 8, 6, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(sort, 0, sort.length - 1);

        System.out.println(Arrays.toString(sort));
    }
}
