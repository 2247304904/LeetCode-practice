package com.zpy.test.test07;

/**
 * @program: LeetCode-practice
 * @description: 反转链表
 * @author: 张鹏宇
 * @create: 2022-04-01 18:20
 **/
public class Demo01 {

    //链表翻转 迭代法
    static Node reversal(Node head) {
        Node prev=null;
        Node next;
        Node curr =head;

        while (curr!=null){
            next=curr.next; //保存下一个
            curr.next=prev; //将前一个的元素指针赋值给
            prev = curr;
            curr=next;  //移动循环



        }
        return prev;
    }

    //链表创建 头插法
    static Node CreateList() {
        Node head = new Node(0);

        for (int i  = 5; i >0; i--) {
            Node node = new Node(i);
            node.next=head.next;
            head.next=node;
        }

        return head.next;
    }

    public static void main(String[] args) {
        Node node = Demo01.CreateList();
        Node temp = node;
        while (node != null){
            System.out.println(node.value);
            node=node.next;
        }
        System.out.println("==========");
        node = Demo01.reversal(temp);
        while (node != null){
            System.out.println(node.value);
            node=node.next;
        }
    }
}
