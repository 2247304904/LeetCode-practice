package com.zpy.test;

/**
 * @author 张鹏宇
 * @date 2021/12/28 11:20
 **/

public class Test04 {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
        ListNode head = null;
//        ListNode node1 = new ListNode(2);
//        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(4);
//        ListNode node4 = new ListNode(5);
//        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        ListNode node5 = head;
//        while(node5!=null){
//            System.out.println(node5.val);
//            node5 = node5.next;
//        }
        System.out.println("----------");
        Test04 test04 = new Test04();
        ListNode node = test04.reverseList(head);
        while(node!=null){
            System.out.println(node.val);
            node =node.next;
        }
    }
}

class ListNode{
    int val;

    public ListNode(int val) {
        this.val = val;
    }
    ListNode next = null;
}
