package com.leetcode.linkedlist;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 这题用了Leetcode比较好
 * 2. 注意每次方法后要进行len的变化
 * 3. index不符合条件要先返回-1
 * 4. print()要注释掉，以免超时
 * 5. 多测试
 * @date 2023/5/29 12:26:21
 */
public class Leetcode707 {

}

class MyLinkedList {
    int len;
    ListNode dummy;
    public void print(){
        ListNode pre=dummy;
        while(pre!=null&&pre.next!=null){
            System.out.print(pre.next.val+"->");
            pre=pre.next;
        }
        System.out.println();
    }
    public MyLinkedList() {
        dummy=new ListNode(-1);
        len=0;
    }

    public int get(int index) {
        // print();
        if(index<0||index>=len){
            return -1;
        }
        ListNode pre=dummy;
        while(pre!=null&&pre.next!=null){
            if(index==0){
                return pre.next.val;
            }
            pre=pre.next;
            index--;
        }
        return -1;
    }

    public void addAtHead(int val) {
        // print();
        ListNode pre=dummy;
        ListNode next=pre.next;
        ListNode newNode=new ListNode(val);
        pre.next=newNode;
        newNode.next=next;
        len++;
    }

    public void addAtTail(int val) {
        // print();
        ListNode pre=dummy;
        while(pre!=null&&pre.next!=null){
            pre=pre.next;
        }
        pre.next=new ListNode(val);
        len++;
    }

    public void addAtIndex(int index, int val) {
        // print();
        if(index<=len){
            ListNode pre=dummy;
            while(pre!=null){
                if(index==0){
                    ListNode cur=pre;
                    ListNode newNode=new ListNode(val);
                    ListNode next=cur.next;
                    cur.next=newNode;
                    newNode.next=next;
                }
                pre=pre.next;
                index--;
            }
            len++;
        }
    }

    public void deleteAtIndex(int index) {
        // print();
        if(index<=len-1){
            // 寻找index-1的结点
            ListNode pre=dummy;
            while(index!=0){
                pre=pre.next;
                index--;
            }
            pre.next=pre.next.next;
            len--;
        }

    }
}
