package com.zpy.LeetCode_offer.day07;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/17 12:48
 **/

public class Demo01 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int length1 = 0;
        int length2 = 0;
        ListNode node = null;
        if (l1 != null) {
            node = l1;
            while (node != null) {
                length1++;
                node = node.next;
            }
        }
        if (l2 != null) {
            node = l2;
            while (node != null) {
                length2++;
                node = node.next;
            }
        }
        int min = Math.min(length1, length2);

        return null;
    }
}
