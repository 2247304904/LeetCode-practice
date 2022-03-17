package com.zpy.test.test02;



public class Test03 {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     * <p>
     * <p>
     * 计算用户逾期扣分数
     *
     * @param dpdInfo string字符串  用户逾期记录，'N': 没有逾期，正常  'Y'：有逾期
     * @return int整型
     */
    public int calDPDScore(String dpdInfo) {
        // write code here
        String key = "Y";
        int index = 0;
        int result = 0;
        for (int i = 0; i < dpdInfo.length(); i++) {
            if (dpdInfo.indexOf(key) >= 0) {
                key += "Y";
                index++;
            }else {
                break;
            }
        }
        if (index == 0) {
            result = 0;
        } else if (index > 0 && index <= 3) {
            result = -10;
        } else if (index > 3 && index <= 7) {
            result = -15;
        } else if (index >7) {
            result = -25;
        }
        return result;
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        int nnn = test03.calDPDScore("NNYYYYYNNYY");
        System.out.println(nnn);
    }
}
