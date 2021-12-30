package com.feng;

import java.util.*;

public class EasySolution {

    /**
     * 1556. 千位分隔数
     *
     * @param n
     * @return
     */
    public String thousandSeparator(int n) {
        String ans = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int len = ans.length();
        int flag = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (flag == 3) {
                sb.append(".");
                flag = 0;
            }
            flag++;
            sb.append(ans.charAt(i));
        }

        return sb.reverse().toString();
    }

    /**
     * 69. Sqrt(x)      二分法 / 牛顿迭代法
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public int mySqrt1(int x) {
        int n = 0;
        while ((long) n * n <= x) {
            n++;
        }
        return n - 1;
    }


    /**
     * 70. 爬楼梯      动态规划
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 1518. 换酒问题
     *
     * @param numBottles
     * @param numExchange
     * @return
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        int m = numBottles / numExchange;
        int n = numBottles % numExchange;
        int ans = numBottles + m;
        while ((m + n) / numExchange > 0) {
            numBottles = (m + n);
            m = numBottles / numExchange;
            n = numBottles % numExchange;
            ans += m;
        }
        return ans;
    }

    /**
     * 67. 二进制求和
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        String max = a;
        String min = b;

        if (m != n) {
            max = m > n ? a : b;
            min = m < n ? a : b;
        }
        m = max.length();
        n = min.length();
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[m + 1];

        for (int i = m - 1; i >= 0; i--) {
            if (n > 0) {
                nums[i + 1] = Integer.parseInt(String.valueOf(max.charAt(i))) + Integer.parseInt(String.valueOf(min.charAt(n - 1)));
            } else {
                nums[i + 1] = Integer.parseInt(String.valueOf(max.charAt(i)));
            }
            n--;
        }
        for (int i = m; i >= 0; i--) {
            if (nums[i] == 2) {
                nums[i] = 0;
                nums[i - 1]++;
            }
            if (nums[i] == 3) {
                nums[i] = 1;
                nums[i - 1]++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[0] == 0) {
            } else {
                sb.append(nums[i]);
            }
        }

        return sb.toString();
    }

    /**
     * 1154. 一年中的第几天
     *
     * @param date
     * @return
     */
    public int dayOfYear(String date) {
        int ans = 0;
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        for (int i = 1; i <= month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                if (month == i) {
                    ans += Math.min(day, 31);
                } else {
                    ans += 31;
                }
            }
            //计算2月份的天数
            if (i == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    if (month == i) {
                        ans += Math.min(day, 29);
                    } else {
                        ans += 29;
                    }
                } else {
                    if (month == i) {
                        ans += Math.min(day, 28);
                    } else {
                        ans += 28;
                    }
                }
            }
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                if (month == i) {
                    ans += Math.min(day, 30);
                } else {
                    ans += 30;
                }
            }
        }
        return ans;
    }

    /**
     * 面试题 08.06. 汉诺塔问题
     *
     * @param A
     * @param B
     * @param C
     */
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {


    }

    /**
     * 剑指 Offer 06. 从尾到头打印链表
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode_1 head) {
        List<Integer> list = new ArrayList<>();
        if (head == null) {
            int[] arr = new int[0];
            return arr;
        }
        while (head.next != null) {
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);
        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(n - 1 - i);
        }
        return arr;
    }

    /**
     * 2099. 找到和最大的长度为 K 的子序列
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSubsequence(int[] nums, int k) {
        int[] arr = new int[k];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        return nums;
    }

    /**
     * 125. 验证回文串
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                sb.append(c);
            }
            if ((c >= 'A' && c <= 'Z')) {
                c = (char) (c + 32);
                sb.append(c);
            }
        }
        String str = sb.toString();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                sb.append(c);
            }
            if ((c >= 'A' && c <= 'Z')) {
                c = (char) (c + 32);
                sb.append(c);
            }
        }
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        return str1.equals(str2);
    }

    /**
     * 171. Excel 表列序号
     *
     * @param columnTitle
     * @return
     */
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('A' + i), i + 1);
        }
        int len = columnTitle.length();
        int n = 1;
        for (int j = len - 1; j >= 0; j--) {
            ans += map.get(columnTitle.charAt(j)) * n;
            n *= 26;
        }
        return ans;
    }

    public int titleToNumber2(String columnTitle) {
        int num = 0;
        int flag = 1;
        int len = columnTitle.length() - 1;
        for (int i = len; i >= 0; i--) {
            int n = columnTitle.charAt(i) - 'A' + 1;
            num += n * flag;
            flag *= 26;
        }
        return num;
    }

    /**
     * 1995. 统计特殊四元组
     *
     * @param nums
     * @return
     */
    public int countQuadruplets(int[] nums) {
        int ans = 0;
        for (int i = 3; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] >= nums[i]) {
                    continue;
                }
                for (int k = j + 1; k < i; k++) {
                    if (nums[j] + nums[k] >= nums[i]) {
                        continue;
                    }
                    for (int l = k + 1; l < i; l++) {
                        if (nums[j] + nums[k] + nums[l] == nums[i]) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }


}
