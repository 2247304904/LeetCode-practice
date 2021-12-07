package com.zpy.youzu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        int[] result = new int[5];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
            count+=input[i];

        }
        for (int i = 0; i < 5; i++) {
            if(input[i]<=0){
                result[i]=0;
            }else {
                result[i]=(int) (input[i] / (count*1.0) * 100);
            }

            System.out.print(result[i]+" ");
        }


    }
}
