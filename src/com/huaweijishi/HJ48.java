package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/3 19:04:48
 */
public class HJ48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            Node fistNode=new Node(sc.nextInt());
            Node dummy=new Node(-1);
            dummy.next=fistNode;
            for(int i=0;i<num-1;i++){
                int insertVal = sc.nextInt();
                int findVal = sc.nextInt();
                Node node = findVal(dummy,findVal);
                Node next = node.next;
                Node insert = new Node(insertVal);
                node.next=insert;
                insert.next=next;
            }
            int delVal = sc.nextInt();
            findAndDelVal(dummy,delVal);
            printVal(dummy.next);
        }
    }
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public static Node findVal(Node node,int findVal){
        while(node!=null){
            if(node.val==findVal){
//                System.out.println("find "+findVal);
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public static void findAndDelVal(Node node,int delVal){
        while(node!=null&&node.next!=null){
            if(node.next.val==delVal){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
    }
    public static void printVal(Node node){
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
    }
}
