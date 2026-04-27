package com.sunil.linearsearch;

public class TwodArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},    // target 99 is (2,1)
                {18, 12},
        };
        int target = 78;
       int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[][] nums, int target) {
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                if (nums[r][c] == target) {
                    return target;
                }
            }
        }
        return -1;
    }
}


