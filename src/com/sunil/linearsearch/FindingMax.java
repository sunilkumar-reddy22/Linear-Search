package com.sunil.linearsearch;
import java.util.Arrays;
public class FindingMax {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},    // target 99 is (2,1)
                {18, 12}
        };
       int  ans = search(arr);
        System.out.println(ans);
    }
    static int  search(int [] [] arr) {
        int  max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];

                }
            }
        }
        return max;

    }
}
