package com.zpy.LeetCode_offer.day04;

/**
 * 剑指 Offer 24. 反转链表
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/08 10:10
 **/

public class Demo02 {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode pre = null;
        ListNode temp =null;
        while (node!=null){
            temp =node.next;
            node.next = pre;
            pre = node;
            node = temp;
        }
        return pre;
    }
}
