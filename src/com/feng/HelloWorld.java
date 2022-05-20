package com.feng;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        test("iaaaiig");
    }

    public static String test(String str) {

        char a = str.charAt(0);
        List<Integer> nums = new ArrayList<>();
        List<Character> chs = new ArrayList<>();
        int n = 1;
        chs.add(a);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                n++;
            } else {
                nums.add(n);
                n = 1;
                a = str.charAt(i);
                chs.add(a);
            }
        }
        nums.add(n);
        int len = 2 * chs.size() - 1;
        String[][] ans = new String[len - 1][len - 1];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                
            }
        }

        return "";
    }
}
