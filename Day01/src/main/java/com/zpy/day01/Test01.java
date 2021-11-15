package com.zpy.day01;

/**
 * 剑指 Offer 05. 替换空格
 */
public class Test01 {


    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        for (char aChar : chars) {
            if (aChar == ' ') {
                result += "%20";
            } else {
                result += aChar;
            }
        }
        System.out.println(result);
        return result;

    }


    public static void main(String[] args) {
//        String s = new String("We are happy.");
        String s = new String(" ");
        Test01 test01 = new Test01();
        String s1 = test01.replaceSpace(s);
        System.out.println(s1);
    }
}

