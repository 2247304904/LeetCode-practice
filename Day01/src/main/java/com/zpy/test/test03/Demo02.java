package com.zpy.test.test03;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo02 {
    /*
     * public class TreeNode {
     *   int val = 0;
     *   TreeNode left = null;
     *   TreeNode right = null;
     *   public TreeNode(int val) {
     *     this.val = val;
     *   }
     * }
     */

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 返回恢复后的二叉搜索树的根节点
     *
     * @param root TreeNode类 传入二叉搜索树的根节点
     * @return TreeNode类
     */
    public TreeNode TreeRecover(TreeNode root) {
        // write code here
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode result = root;
        TreeNode x = null, y = null, pred = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pred != null && root.val < pred.val) {
                y = root;
                if (x == null) {
                    x = pred;

                } else {
                    break;
                }
            }
            pred = root;
            root = root.right;
        }
        swap(x, y);

        return result;
    }

    public void swap(TreeNode x, TreeNode y) {
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }
}
