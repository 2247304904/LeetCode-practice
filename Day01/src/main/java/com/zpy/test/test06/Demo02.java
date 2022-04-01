package com.zpy.test.test06;

public class Demo02 {
    public static void main(String[] args) {
        String a="aa";
        String b="aa";
        String c= new String("aa");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));
    }
}
