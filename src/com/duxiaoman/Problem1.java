package com.duxiaoman;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=Integer.parseInt(sc.nextLine());
            String[] s = sc.nextLine().split(" ");
            String[] s1 = sc.nextLine().split(" ");
            int[] arr=new int[n-1];
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            TreeNode root=new TreeNode(1,Integer.parseInt(s1[0]));

            buildTree(root,arr,s1,1);
            System.out.println(traverse(root));

        }
    }
    public static void buildTree(TreeNode root,int[] arr,String[] s1,int val){
        if(root==null){
            return;
        }
        List<Integer> findList = findVal(val, arr);
        if(findList.size()>1){
            root.left=new TreeNode(findList.get(0), Integer.parseInt(s1[findList.get(0)-1]));
            buildTree(root.left,arr,s1,root.left.val);
            root.right=new TreeNode(findList.get(1),Integer.parseInt(s1[findList.get(0)-1]));
            buildTree(root.right,arr,s1,root.right.val);
        }else if(findList.size()==1){
            root.left=new TreeNode(findList.get(0), Integer.parseInt(s1[findList.get(0)-1]));
            buildTree(root.left,arr,s1,root.left.val);
        }else{
            return ;
        }
    }
    public static List<Integer> findVal(int val,int[] arr){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                list.add(i+1);
            }
        }
        return list;
    }
    public static int traverse(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left=traverse(root.left);
        int right=traverse(root.right);
        if(root.color==1){
            return left+right;
        }else {
            return left*right;
        }
    }
    private static TreeNode findTreeNode(TreeNode root, int rootVal) {
        if(root==null){
            return null;
        }
        if(root.val==rootVal){
            return root;
        }
        TreeNode left = findTreeNode(root.left, rootVal);
        if(left==null){
            TreeNode right=findTreeNode(root.right,rootVal);
            return right;
        }
        return left;
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        int color;
        public TreeNode(int val,int color){
            this.val=val;
            this.color=color;
        }
    }
}
