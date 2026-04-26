package com.sunil.linearsearch;

public class TargetChar {
    public static void main(String[] args) {
        String  name = "sunil";
        char target = 'm';
       boolean ans = letter(name,target);
        System.out.println(ans);
    }
    static boolean letter(String name,char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i <name.length(); i++) {
            char element = name.charAt(i);
            if (target == element) {
                return true;
            }
        }
        return false;
    }
}
