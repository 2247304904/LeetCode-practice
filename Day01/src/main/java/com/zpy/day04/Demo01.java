package com.zpy.day04;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/08 09:58
 **/

public class Demo01 {
    public int[] reversePrint(ListNode head) {
        int temp[] = new int[10000];

        int len = 0;
        ListNode node;
        node = head;
        while (node != null) {
            temp[len] = node.val;
            len++;
            node = node.next;
        }
        int res[] = new int[len];
        for (int i = 0, j = len - 1; i < len; i++, j--) {
            res[i] = temp[j];

        }
        return res;
    }
}
