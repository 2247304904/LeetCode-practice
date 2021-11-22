package com.zpy.mihayou;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class Demo02 {

    @Test

    public ArrayList<ArrayList<Integer>> permute(int[] nums) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
            int[] visited = new int[nums.length];
            backtrack(res, nums, new ArrayList<Integer>(), visited);
            return res;

        }

        private void backtrack(ArrayList<ArrayList<Integer>> res, int[] nums, ArrayList<Integer> tmp, int[] visited) {
            if (tmp.size() == nums.length) {
                res.add(new ArrayList<Integer>(tmp));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (visited[i] == 1) continue;
                visited[i] = 1;
                tmp.add(nums[i]);
                backtrack(res, nums, tmp, visited);
                visited[i] = 0;
                tmp.remove(tmp.size() - 1);
            }
        }







}
