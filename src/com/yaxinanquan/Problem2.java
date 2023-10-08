package com.yaxinanquan;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/17 14:53:12
 */
public class Problem2 {
    public static void main(String[] args) {
        int[] arr=new int[]{250,100,150,50,250};
        int target=300;
        System.out.println(maxProducts(arr,target));
    }
    public static int maxProducts (int[] prices, int target) {
        // 滑动窗口
        int left=0;
        int right=0;
        int count=0;
        int max=0;
        while(right<prices.length){
            count+=prices[right];
            right++;
            while(count>target){
                count-=prices[left];
                left++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}
