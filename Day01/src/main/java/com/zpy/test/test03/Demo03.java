package com.zpy.test.test03;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo03 {
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


        TreeNode x = null, y = null, pred = null, predecessor = null;

        while (root != null) {
            if (root.left != null) {
                predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                } else {
                    if (pred != null && root.val < pred.val) {
                        y = root;
                        if (x == null) {
                            x = pred;
                        }
                    }
                    pred = root;
                    predecessor.right = null;
                    root= root.right;
                }

            }
            else {
                if (pred!=null && root.val < pred.val){
                    y = root;
                    if(x==null){
                        x = pred;
                    }
                }
            }

        }


        swap(x, y);

        return root;
    }

    public void swap(TreeNode x, TreeNode y) {
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }
}
