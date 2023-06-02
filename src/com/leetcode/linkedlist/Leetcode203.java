package com.leetcode.linkedlist;

import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 有时需要移动到下一个位置，有时不需要
 * @date 2023/5/29 12:15:05
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Leetcode203 {
    public static void main(String[] args) {
        int[] head=new int[]{1,2,6,3,4,5,6};
        int val=6;
        ListNode dummy=new ListNode(-1);
        ListNode pre=dummy;
        for(int i=0;i<head.length;i++){
            pre.next=new ListNode(head[i]);
            pre=pre.next;
        }
        removeElements(dummy.next,val);
        ListNode start=dummy.next;
        while(start!=null){
            System.out.print(start.val+",");
            start=start.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val){
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        while(pre!=null&&pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }
}
