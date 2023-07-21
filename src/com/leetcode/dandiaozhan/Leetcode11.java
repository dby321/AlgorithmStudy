package com.leetcode.dandiaozhan;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/9 11:26:44
 */
public class Leetcode11 {
    public static void main(String[] args) {
        int[] height=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int res=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int cur_area=Math.min(height[left],height[right])*(right-left);
            res=Math.max(res,cur_area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}
