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
     * 面试题 08.06. 汉诺塔问题（未完成）
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
     * 2099. 找到和最大的长度为 K 的子序列（未完成）
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

    /**
     * 507. 完美数
     *
     * @param num
     * @return
     */
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    /**
     * 2022. 将一维数组转变成二维数组
     *
     * @param original
     * @param m
     * @param n
     * @return
     */
    public int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != m * n) {
            return new int[1][];
        }
        int[][] ans = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[k];
                k++;
            }
        }
        return ans;
    }

    /**
     * 1185. 一周中的第几天
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int days = 0;
        for (int i = 1971; i < year; i++) {
            days += isLeap(i) ? 366 : 365;
        }
        days += getMonthDays(month, year);
        days += day;
        int week = (days + 4) % 7;
        return weekDays[week];
    }

    public boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int getMonthDays(int month, int year) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                days += 31;
            }
            if (i == 2) {
                if (isLeap(year)) {
                    days += 29;
                } else {
                    days += 28;
                }
            }
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            }
        }
        return days;
    }

    /**
     * 1576. 替换所有的问号
     *
     * @param s
     * @return
     */
    public String modifyString(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '?') {
                return "a";
            }
        }
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '?') {
                if (i == 0) {
                    if (s.charAt(i + 1) == '?') {
                        sb.append('a');
                    } else {
                        int flag = 'a' < s.charAt(i + 1) ? 'a' : s.charAt(i + 1) + 1;
                        sb.append((char) flag);
                    }
                } else if (i == len - 1) {
                    sb.append((char) ('a' < sb.charAt(i - 1) ? 'a' : sb.charAt(i - 1) + 1));
                } else {
                    if (s.charAt(i + 1) == '?') {
                        sb.append((char) ('a' < sb.charAt(i - 1) ? 'a' : sb.charAt(i - 1) + 1));
                    } else {
                        if (sb.charAt(i - 1) < s.charAt(i + 1)) {
                            int flag = ('a' < sb.charAt(i - 1) ? 'a' : sb.charAt(i - 1) + 1);
                            sb.append((char) (flag < s.charAt(i + 1) ? flag : s.charAt(i + 1) + 1));
                        } else if (sb.charAt(i - 1) == s.charAt(i + 1)) {
                            sb.append((char) ('a' < sb.charAt(i - 1) ? 'a' : sb.charAt(i - 1) + 1));
                        } else {
                            int flag = ('a' < s.charAt(i + 1) ? 'a' : s.charAt(i + 1) + 1);
                            sb.append((char) (flag < sb.charAt(i - 1) ? flag : sb.charAt(i - 1) + 1));
                        }
                    }
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public String modifyString2(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (arr[i] == '?') {
                for (int j = 0; j < 3; j++) {
                    if ((i > 0 && arr[i - 1] == (char) ('a' + j)) || (i < n - 1 && arr[i + 1] == ('a' + j))) {
                        continue;
                    }
                    arr[i] = (char) ('a' + j);
                    break;
                }
            }
        }
        return new String(arr);
    }

    /**
     * 1614. 括号的最大嵌套深度
     *
     * @param s
     * @return
     */
    public int maxDepth(String s) {
        int ans = 0;
        int n = s.length();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                flag++;
            } else if (s.charAt(i) == ')') {
                flag--;
            }
            ans = Math.max(ans, flag);
        }
        return ans;
    }

    /**
     * 389. 找不同
     *
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.charAt(0);
        }
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < n + 1; j++) {
            if (map.containsKey(t.charAt(j)) && map.get(t.charAt(j)) - 1 >= 0) {
                map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
            } else {
                return t.charAt(j);
            }
        }
        return t.charAt(n);
    }

    public char findTheDifference2(String s, String t) {
        int m = 0;
        int n = 0;
        for (char c : s.toCharArray()) {
            n += c;
        }
        for (char c : t.toCharArray()) {
            m += c;
        }
        return (char) (m - n);
    }

    public char findTheDifference3(String s, String t) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += t.charAt(i);
            res -= s.charAt(i);
        }
        res += s.charAt(n);
        return (char) res;
    }

    /**
     * 747. 至少是其他数字两倍的最大数
     *
     * @param nums
     * @return
     */
    public int dominantIndex(int[] nums) {
        int res = 0, n = nums.length;
        if (n == 1) {
            return 0;
        }
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int max = arr[n - 1];
        for (int i = 0; i < n; i++) {
            if (nums[i] == max) {
                res = i;
            }
        }
        if (arr[n - 2] * 2 > max) {
            return -1;
        }
        return res;
    }

    public int dominantIndex2(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int m1 = -1, m2 = -1, index = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                index = i;
            } else if (nums[i] > m2) {
                m2 = nums[i];
            }
        }
        return m1 >= m2 * 2 ? index : -1;
    }

    /**
     * 1716. 计算力扣银行的钱
     *
     * @param n
     * @return
     */
    public int totalMoney(int n) {
        int sum = 0;
        int a = n / 7;
        int b = n % 7;
        int i = 1;
        for (; i <= a; i++) {
            sum += ((i + 3) * 6 + (i + 3));
        }
        for (int j = 1; j <= b; j++) {
            sum += i;
            i++;
        }
        return sum;
    }



}
