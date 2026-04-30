package com.sunil.linearsearch;

public class MoveCoins {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
       int ans = count(nums);
        System.out.println(ans);
    }
    static int count(int [] nums) {
        int even = 0;
        int odd = 0;
        for (int pos : nums) {   //for enhanced  loop tracking each element.
            if (pos % 2 == 0) {  // moving coins through checking same patiy or not.
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }

}
