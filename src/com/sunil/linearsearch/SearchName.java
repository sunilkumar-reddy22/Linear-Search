package com.sunil.linearsearch;

public class SearchName {
    public static void main(String[] args) {
        String [] name = {"jack"," mike", "kathy", "steve", "sunil"};
        String target = "steve";
       int ans = search(name,target);
        System.out.println(ans);
    }
    static int search(String [] name, String target) {
        if (name.length == 0) {
            return -1;
        }
        for (int i = 0; i < name.length; i++) {
            String element = name[i];
            if (element.equals(target)) {   //what is this .equals to.
                return i;
            }
        }
        return -1;
    }
}
