package com.zpy.daily;

/**
 * @program: LeetCode-practice
 * @description: 二叉树
 * @author: 张鹏宇
 * @create: 2022-08-27 15:39
 **/

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
