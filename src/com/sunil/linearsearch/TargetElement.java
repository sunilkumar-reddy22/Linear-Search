package com.sunil.linearsearch;

public class TargetElement {
    public static void main(String[] args) {
        int [] nums = {15, 17, 16, 22, 8, -1 };
        int target = 8;
      int ans =  linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch(int [] nums,int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
