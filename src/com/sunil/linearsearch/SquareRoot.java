package com.sunil.linearsearch;

public class SquareRoot {
    public static void main(String[] args) {
        int square = 8;
       int result = find(square);
        System.out.println(result);
    }
    static int find(int x){
    int start = 1;
    int ans = 0;
    int end = x;
    while(start <= end) {  // if they don't find small number then we go left to check!
        int mid = start + (end - start) / 2;
        if (mid <= x / mid) {   // mid*mid <x both are same of overflow we used optimised.
            ans = mid;   //if mid is less than x amd store the value in ans but it is valid and we go for bigger num bia right.
            start = mid + 1;
        } else {
            end = mid - 1;  //go left to check the small nums.
        }
    }
    return ans;

    }
}
