package com.zpy.test.test09;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode-practice
 * @description: 160.链表相交 https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @author: 张鹏宇
 * @create: 2022-04-15 17:13
 **/

public class Demo {
    //暴力解法
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode temp = headA;

        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }
            temp = headB;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
