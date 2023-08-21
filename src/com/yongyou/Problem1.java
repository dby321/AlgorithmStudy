package com.yongyou;

import java.util.ArrayList;
import java.util.Collections;

public  class Problem1 {
    public static class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
  }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(6);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        groupSort(head,2);
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 将单链表的元素按每n个一组排序
     * @param head ListNode类 列表的头节点
     * @param n int整型 每组的节点数
     * @return ListNode类
     */
    public static ListNode groupSort (ListNode head, int n) {
        // write code here
        ListNode follow=head;
        int len=0;
        while(follow!=null){
            follow=follow.next;
            len++;
        }
        if(n>len){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode left=dummy;
        ListNode right=dummy;
        ArrayList<ListNode> newList=new ArrayList<>();
        for(int i=0;i<len/n;i++){
            for(int j=0;j<n;j++){
                right=right.next;
            }
            ListNode next=right.next;
            right.next=null;
            sort(left,newList);
            left=new ListNode(-1);
            left.next=next;
            right.next=next;
        }
//        for(int i=0;i<newList.size();i++){
//            System.out.println(newList.get(i).val+" ");
//        }
        while(left!=null&&left.next!=null){
            newList.add(left.next);
            left=left.next;
        }
        ListNode newDummy=new ListNode(-1);
        ListNode newFollow=newDummy;
        for(int i=0;i<newList.size();i++){
            newFollow.next=newList.get(i);
            newFollow=newFollow.next;
        }
        return newDummy.next;
    }
    public static void sort(ListNode node , ArrayList<ListNode> newList){
        ArrayList<Integer> list=new ArrayList<>();
        ListNode follow=node;
        while(follow!=null&&follow.next!=null){
            follow=follow.next;
            list.add(follow.val);
        }

        follow=node;
        Collections.sort(list,(a,b)->{
            return b-a;
        });
        for(int i=0;i<list.size();i++){
            ListNode findNode=null;
            while(follow!=null&&follow.next!=null){
                if(list.get(i).equals(follow.next.val)){
                    findNode=follow.next;
                    follow.next=follow.next.next;
                    newList.add(findNode);
                    break;
                }
                follow=follow.next;
            }
            follow=node;
        }
    }

}
