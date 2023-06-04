package com.jinshan;

import apple.laf.JRSUIUtils;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/3 12:32:10
 */
public class Two {
    // 1 2 2 1 2 1 2
    public static int index=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        if(sc.hasNext()){
            String s=sc.nextLine();
            String[] strs = s.split(" ");
            for(String str:strs){
                list.add(Integer.valueOf(str));
            }
        }
//        System.out.println(list);
        TreeNode root=new TreeNode(list.get(0));
        traverse(root,list);
        System.out.println(houxu(root));
    }

    private static void traverse(TreeNode root, List<Integer> list) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(index<list.size()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                node.left=new TreeNode(list.get(index));
                queue.offer(node.left);
                node.right=new TreeNode(list.get(index));
                queue.offer(node.right);
                index++;
            }
        }
    }
    public static boolean houxu(TreeNode root){
        if(root==null)return false;

        boolean flag1=houxu(root.left);
        boolean flag2=houxu(root.right);
        if(root.left==null||root.right==null){
            return false;
        }
        if(root.left.val==root.right.val){
            return true;
        }
        root.val=root.left.val+root.right.val+root.val;
//        System.out.println(root.val);
        return flag1||flag2;
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
