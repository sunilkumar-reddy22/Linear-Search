package com.sunil.linearsearch;

public class Badversion {
static int bad = 4;
    public static void main(String[] args) {
        int n = 5;
       int ans = version(n);
        System.out.println(ans);
    }
    static int version(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isbadversion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static boolean isbadversion(int mid ) {
        if (mid >= 4) {
            return true;
        } else {
            return false;
        }
    }


}
