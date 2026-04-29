package com.sunil.linearsearch;
//leetcode 167
import java.util.Arrays;
public class TwoSumtwo {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ans = Twosum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Twosum(int[] numbers, int target) {
        int left = 0;  //starting from 0,
        int right = numbers.length - 1; //from last element;
        while (left < right) {
            int sum = numbers[0] + numbers[right];
            if (target == sum) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;

            }

        }
        return new int[]{-1, -1};
    }
}

