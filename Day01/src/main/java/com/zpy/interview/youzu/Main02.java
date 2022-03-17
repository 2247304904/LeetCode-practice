package com.zpy.interview.youzu;

import java.util.Scanner;

public class Main02 {

    public static int GetUglyNumber_Solution(int index) {
        int count = 0;
        int i;
        for (i = 1; count <= index; i++) {
            if (isUgly(i)) {
                count++;
            }
        }
        return i;
    }

    private static boolean isUgly(int i) {
        while (i % 2 == 0) {
            i = i / 2;
        }
        while (i % 3 == 0) {
            i = i / 3;
        }
        while (i % 7 == 0) {
            i = i / 7;
        }
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Main02.GetUglyNumber_Solution(scanner.nextInt());
        System.out.println(i);
    }
}
