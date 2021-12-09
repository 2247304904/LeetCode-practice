package com.zpy.test;

/**
 * @author 张鹏宇
 * @date 2021/12/08 20:01
 **/

public class Test01 implements Runnable{

    static Integer value;
    @Override
    public void run() {
        System.out.println(value);
        value++;
    }

    public Test01() {
        value =1;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();

    }
}
