package com.feng;

import com.feng.multithreading.Foo;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws ParseException {
//        System.out.println(new Solution().buddyStrings("abcaa", "abcbb"));
//        System.out.println(new Solution().originalDigits("zeroonetwothreefourfivesixseveneightnine"));
//        System.out.println(new Solution().integerReplacement(2147483647));
//        System.out.println(new Solution().getMoneyAmount(10));
//        System.out.println(new Solution().maxPower("leetcode"));
//        System.out.println(new Solution().maxPower("abbcccddddeeeeedcba"));
//        System.out.println(new Solution().maxPower("triplepillooooow"));
//        System.out.println(new Solution().maxPower("hooraaaaaaaaaaay"));
//        System.out.println(new Solution().maxPower("tourist"));
//        System.out.println(new Solution().maxPower("cc"));
//        System.out.println(new Solution().maxPower("acc"));
//        int[] time = {-2, 5, 0, 2, -2};
//        System.out.println(new Solution().findRelativeRanks(time));
//        System.out.println(new Solution().largestSumAfterKNegations2(time,3));
//        System.out.println(new Solution().canConstruct("aa","ab"));
//        System.out.println(new Solution().truncateSentence("chopper",1));
//        String[] b = {"a","b","c","ab","ac","bc","abc"};
//        System.out.println(new Solution().countConsistentStrings("abc", b));
//        String s = "2021-11-11 12:00:00";
//        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        Date date1 = sdf3.parse(s);
//        System.out.println(date1);
//        System.out.println(sdf4.format(date1));
//        String[] board = {"O  ", "   ", "   "};
//        System.out.println(new Solution().validTicTacToe(board));
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss");
//        String format = sdf.format(date);
//        System.out.println(sdf.format(date));
//        System.out.println(format);


//        String licensePlate = "";
//        String[] words = {};
//        System.out.println(new Solution().shortestCompletingWord(licensePlate, words));

//        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
//        System.out.println(new Solution().maxIncreaseKeepingSkyline(grid));
//        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
//        int[][] courses = {{5, 5}, {4, 6}, {2, 6}};
//        int[][] courses = {{3, 2}, {4, 3}};

//        System.out.println(new Solution().scheduleCourse(courses));
//        String[] str = {"XOX", " X ", "   "};
//        System.out.println(new Solution().validTicTacToe(str));

        ListNode_2 l1 = new ListNode_2(2);
        l1.next = new ListNode_2(4);
        l1.next.next = new ListNode_2(3);

        ListNode_2 l2 = new ListNode_2(5);
        l2.next = new ListNode_2(6);
        l2.next.next = new ListNode_2(4);
        l2.next.next.next = new ListNode_2(3);

        System.out.println(new Solution().addTwoNumbers(l1, l2));

    }
}
