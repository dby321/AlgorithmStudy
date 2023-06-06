package com.leetcode.greedy;


/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 15:44:14
 */
 class TreeNode {
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

public class Leetcode968 {
static int res=0;

    public static void main(String[] args) {

    }

    public static int minCameraCover(TreeNode root) {
        if (minCame(root) == 0) {
            res++;
        }
        return res;
    }

    public static int minCame(TreeNode root) {
        if (root == null) {
            return 2;
        }
        int left = minCame(root.left);
        int right = minCame(root.right);
        if(left==2&&right==2){
            return 0;
        }
        else if(left==0||right==0){
            res++;
            return 1;
        }
        else {
            return 2;
        }

    }
}
