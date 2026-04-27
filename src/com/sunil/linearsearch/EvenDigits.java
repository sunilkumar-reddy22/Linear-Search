package com.sunil.linearsearch;
//1295 leetcode
public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,143,133,4132};
       int ans = search(nums);  //return 2.
        System.out.println(ans);
    }
    static int search(int [] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        int digits = 0;
            while (num > 0) {
              num = num / 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
