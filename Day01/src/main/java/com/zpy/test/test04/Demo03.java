package com.zpy.test.test04;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();

        int a = 1, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 100000007;
            a = b;
            b = sum;
        }
        System.out.println(a);
    }
}
