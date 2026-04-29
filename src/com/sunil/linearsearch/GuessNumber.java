package com.sunil.linearsearch;

public class GuessNumber {
// add static to in pick
   static  int pick = 6;

    public static void main(String[] args) {
        int n = 10;
       int ans = guessnumber(n);
        System.out.println(ans);
    }
//creating api
    static int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    } //logic stats from here.
       static int guessnumber ( int n) {
                int start = 1;
                int end = n;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    int result = guess(mid);
                    if (result == 0) {
                        return mid;
                    } else if (result == 1) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }

                }
                return -1;
            }

    }

