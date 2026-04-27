package com.sunil.linearsearch;
import java.util.Arrays;
public class TwodArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},    // target 99 is (2,1)
                {18, 12}
        };
        int target = 78;
       int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int []  search(int[][] nums, int target) {  //outside loop for row.
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {  //Inner loop is for col.
                if (nums[r][c] == target) {
                    return new int []{r,c};   //we are returning indices in new 1d array.
                }
            }
        }
        return new int  []{-1,-1};
    }
}


