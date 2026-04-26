package com.sunil.linearsearch;

public class Targetboolean {
    public static void main(String[] args) {
        int [] nums = {15,18,9,0,20,6};
        int target = 9;
       boolean ans = check(nums,target);
        System.out.println(ans);
    }
    static boolean check(int [] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
        if(nums.length == 0) {
            return false;
        }
            int element = nums[i];  //storing the value in the variable named element and it checks in if condition
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
