package com;

public class CycleQueue {
    Object[] arr;
    int right=0;
    int left=0;
    int len=0;
    public CycleQueue(int length){
        this.arr=new Object[length];
    }

    /**
     * @param object
     */
    public synchronized void insert(Object object){
        if(!isFull()){
            if(right==arr.length){
                right=left;
            }
            arr[right]=new Object();
            right++;
            len++;
        }
        throw new RuntimeException("队列满了");
    }
    public synchronized Object delete(){
        if(!isEmpty()){
            if(left==arr.length){
                left=0;
            }
            Object object= arr[left];
            left++;
            len--;
            return object;
        }
        throw new RuntimeException("队列为空");
    }
    public boolean isEmpty(){
        if(len==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(len>=arr.length){
           return true;
        }
        return false;
    }
}
