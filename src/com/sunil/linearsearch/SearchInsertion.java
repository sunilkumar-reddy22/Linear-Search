package com.sunil.linearsearch;

public class SearchInsertion {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 1;
       int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int n) {
        int start = 0;
        int end = nums.length -1;
        while (start < end) {
            int mid = start + (end - start) / 2; // finding the mid value of target
            if (nums[mid] == n) {
                return mid;
            } else if (nums[mid] < n) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return start;
    }
}
