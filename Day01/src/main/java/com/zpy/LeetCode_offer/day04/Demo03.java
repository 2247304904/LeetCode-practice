package com.zpy.LeetCode_offer.day04;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 *
 * @author 张鹏宇
 * @date 2021/12/09 11:05
 **/

public class Demo03 {
    public Node copyRandomList(Node head) {
        Node node = null;
        Node newHead = new Node(0);
        if(head!=null){


               while (node!=null){

               }
        }

        return newHead;
    }

}

/**
 * 链表类
 */

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}