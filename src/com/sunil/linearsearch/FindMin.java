package com.sunil.linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int [] nums = {2,5,7,8,9,1};
       int ans = find(nums);
        System.out.println(ans);
    }
    static int find(int [] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

}
