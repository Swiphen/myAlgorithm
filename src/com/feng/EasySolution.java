package com.feng;

import javafx.embed.swing.SwingFXUtils;

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

    /**
     * 219. 存在重复元素 II
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
//        if (len == 2) {
//            if (nums[0] == nums[1]) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        for (int i = 0; i < (len - 1); i++) {
//            int len2 = (i + k + 1) < len ? (i + k + 1) : len - 1;
//            for (int j = i + 1; j < len2; j++) {  //j - i <= k --> j = k + i   1-
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
        if (len == 1 || k == 0) {
            return false;
        }
        for (int i = 0; i < len - 1; i++) {
            int len1 = (i + 1 + k) < len ? (i + 1 + k) : len;
            for (int j = i + 1; j < len1; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 1399. 统计最大组的数目（未完成）
     *
     * @param n
     * @return
     */
    public int countLargestGroup(int n) {


        return 0;
    }

    /**
     * 599. 两个列表的最小索引总和
     *
     * @param list1
     * @param list2
     * @return
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int flag = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                map.put(list2[j], map.get(list2[j]) + j);
                flag = Math.min(flag, map.get(list2[j]));
            }
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i]) && map.get(list2[i]) == flag) {
                list.add(list2[i]);
            }
        }
        String[] str = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            str[j] = list.get(j);
        }
        return str;
    }

    public String[] findRestaurant2(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> list = new ArrayList<>();
        int flag = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                if (map.get(list2[j]) + j < flag) {
                    list.clear();
                    list.add(list2[j]);
                    flag = map.get(list2[j]) + j;
                } else if (map.get(list2[j]) + j == flag) {
                    list.add(list2[j]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

    /**
     * 1332. 删除回文子序列
     *
     * @param s
     * @return
     */
    public int removePalindromeSub(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    /**
     * 1688. 比赛中的配对次数（未完成）
     *
     * @param n
     * @return
     */
    public int numberOfMatches(int n) {
        return n - 1;
    }

    /**
     * 1984. 学生分数的最小差值
     *
     * @param nums
     * @param k
     * @return
     */
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = len; i >= k; i--) {
            min = Math.min(min, nums[i - 1] - nums[i - k]);
        }
        return min;
    }

    /**
     * 1380. 矩阵中的幸运数
     *
     * @param matrix
     * @return
     */
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix[0].length;
        int n = matrix.length;
        int[][] min = new int[n][2]; //行

        for (int i = 0; i < n; i++) {
            int flag = matrix[i][0];
            min[i][0] = flag;
            min[i][1] = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < flag) {
                    flag = matrix[i][j];
                    min[i][0] = flag;
                    min[i][1] = j;
                }
//                System.out.print(matrix[i][j] + " ");
            }
//            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int k = min[i][1];
            for (int j = 0; j < n; j++) {
                if (matrix[j][k] > min[i][0]) {
                    break;
                } else if ((j == n - 1) && (matrix[j][k] <= min[i][0])) {
                    list.add(min[i][0]);
                }
            }
        }

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[j][i] + " ");
//            }
//            System.out.println();
//        }

        return list;
    }

    /**
     * 1189. “气球” 的最大数量
     *
     * @param text
     * @return
     */
    public int maxNumberOfBalloons(String text) {
        int ans = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }
        if (map.getOrDefault('b', 0) > 0 && map.getOrDefault('a', 0) > 0 && map.getOrDefault('l', 0) > 1 && map.getOrDefault('o', 0) > 1 && map.getOrDefault('n', 0) > 0) {
            ans = Math.min(ans, map.get('b'));
            ans = Math.min(ans, map.get('a'));
            ans = Math.min(ans, map.get('l') / 2);
            ans = Math.min(ans, map.get('o') / 2);
            ans = Math.min(ans, map.get('n'));
        } else {
            ans = 0;
        }
        return ans;
    }

    public int maxNumberOfBalloons1(String text) {
        int[] arr = {0, 0, 0, 0, 0};
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                arr[0]++;
            }
            if (text.charAt(i) == 'a') {
                arr[1]++;
            }
            if (text.charAt(i) == 'l') {
                arr[2]++;
            }
            if (text.charAt(i) == 'o') {
                arr[3]++;
            }
            if (text.charAt(i) == 'n') {
                arr[4]++;
            }
        }
        int ans = arr[0];
        ans = Math.min(ans, arr[1]);
        ans = Math.min(ans, arr[2] / 2);
        ans = Math.min(ans, arr[3] / 2);
        ans = Math.min(ans, arr[4]);
        return ans;
    }

    /**
     * 806. 写字符串需要的行数
     *
     * @param widths
     * @param s
     * @return
     */
    public int[] numberOfLines(int[] widths, String s) {
        int[] ans = {1, 0};
        int sum = 0;
        int len = widths.length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put((char) ('a' + i), widths[i]);
        }
        for (int i = 0; i < s.length(); i++) {
            if (sum + map.get(s.charAt(i)) <= 100) {
                sum += map.get(s.charAt(i));

            } else {
                ans[0]++;
                sum = map.get(s.charAt(i));
            }
            if (i == s.length() - 1) {
                ans[1] = sum;
            }
        }
        return ans;
    }

    public int[] numberOfLines2(int[] widths, String s) {
        int[] arr = {1, 0};
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sum + widths[s.charAt(i) - 'a'] <= 100) {
                sum += widths[s.charAt(i) - 'a'];
            } else {
                arr[0] += 1;
                sum = widths[s.charAt(i) - 'a'];
            }
        }
        arr[1] = sum;
        return arr;
    }

    public int[] numberOfLines3(int[] widths, String s) {
        int len = 1;
        int sum = 0;
        for (char c : s.toCharArray()) {
            int n = widths[c - 'a'];
            sum += n;
            if (sum > 100) {
                len++;
                sum = n;
            }
        }
        return new int[]{len, sum};
    }

    /**
     * 905. 按奇偶排序数组
     *
     * @param nums
     * @return
     */
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 0) {
                int n = nums[i];
                for (int j = i; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = n;
            }
        }

        return nums;
    }

    public int[] sortArrayByParity1(int[] nums) {
        int len = nums.length, n = 0;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 0) {
                ans[n++] = nums[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 1) {
                ans[n++] = nums[i];
            }
        }
        return ans;
    }

    /**
     * 914. 卡牌分组
     *
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {
        int len = deck.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }
        int n = -1;
        for (int i = 1; i < len; i++) {
            if (map.get(deck[i]) > 0) {
                if (n == -1) {
                    n = map.get(deck[i]);
                } else {
                    n = gcd(n, map.get(deck[i]));
                }
            }
        }
        return n >= 2;
    }

    //求公约数
    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    /**
     * 1791. 找出星型图的中心节点
     *
     * @param edges
     * @return
     */
    public int findCenter(int[][] edges) {

        return ((edges[0][0] == edges[1][0]) || (edges[0][0] == edges[1][1])) ? edges[0][0] : edges[0][1];
    }

    /**
     * 917. 仅仅反转字母
     *
     * @param s
     * @return
     */
    public String reverseOnlyLetters(String s) {
        String s1 = s;
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int j = len - 1;
        for (int i = 0; i < len; i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                for (; j >= 0; j--) {
                    if ((s1.charAt(j) >= 'a' && s1.charAt(j) <= 'z') || (s1.charAt(j) >= 'A' && s1.charAt(j) <= 'Z')) {
                        sb.append(s1.charAt(j));
                        j--;
                        break;
                    }
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * 1160. 拼写单词（未完成）
     *
     * @param words
     * @param chars
     * @return
     */
    public int countCharacters(String[] words, String chars) {
        int ans = 0;

        return ans;
    }

    /**
     * 1929. 数组串联
     *
     * @param nums
     * @return
     */
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int j = 0;
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[j];
                j++;
            }
        }
        return arr;
    }

    /**
     * 1507. 转变日期格式
     *
     * @param date
     * @return
     */
    public String reformatDate(String date) {
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] s = date.split(" ");
        int n = 1;
        for (String month : months) {
            if (month.equals(s[1])) {
                if (n <= 9) {
                    s[1] = "0" + String.valueOf(n);
                } else {
                    s[1] = String.valueOf(n);
                }
            } else {
                n++;
            }
        }
        if (s[0].charAt(1) >= '0' && s[0].charAt(1) <= '9') {
            s[0] = String.valueOf(s[0].charAt(0)) + String.valueOf(s[0].charAt(1));
        } else {
            s[0] = "0" + String.valueOf(s[0].charAt(0));
        }
        return s[2] + "-" + s[1] + "-" + s[0];
    }

    /**
     * 258. 各位相加
     *
     * @param num
     * @return
     */
    public int addDigits(int num) {
        int x = 0, ans = num;
        while (ans > 9) {
            x += num % 10;
            num /= 10;
            if (num == 0) {
                num = x;
                ans = x;
                x = 0;
            }
        }
        return ans;
    }

    public int addDigits2(int num) {
        return (num - 1) % 9 + 1;
    }

    /**
     * 521. 最长特殊序列 Ⅰ
     *
     * @param a
     * @param b
     * @return
     */
    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }

    /**
     * 504. 七进制数
     *
     * @param num
     * @return
     */
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String str = "";
        if (num < 0) {
            num = -num;
        }
        str = convert(num, str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (num < 0) {
            sb.append("-");
            str = sb.reverse().toString();
        } else {
            str = sb.reverse().toString();
        }

        return str;
    }

    public String convert(int num, String str) {
        if (num == 0) {
            return str;
        }
        str += (num % 7);
        return convert(num / 7, str);
    }

    public String convertToBase7_2(int num) {
        boolean flag = num < 0;
        if (!flag) {
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(num % 7);
            num /= 7;
        } while (num != 0);
        sb.reverse();
        return flag ? sb.toString() : "-" + sb.toString();
    }

    public String convertToBase7_3(int num) {
        return Integer.toString(num, 7);
    }

    /**
     * 1544. 整理字符串
     *
     * @param s
     * @return
     */
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int i = 0; i < s.length() - 2; i++) {
            if ((s.charAt(i) == (s.charAt(i + 1) + 32)) || (s.charAt(i) == (s.charAt(i + 1) - 32))) {
                sb.delete(i, i + 2);
                return makeGood(sb.toString());
            }
        }
        return sb.toString();
    }

    /**
     * 1408. 数组中的字符串匹配
     *
     * @param words
     * @return
     */
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }

    /**
     * 589. N 叉树的前序遍历（未完成）
     *
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();


        return list;
    }

    /**
     * 168. Excel表列名称【26进制转换】
     *
     * @param columnNumber
     * @return
     */
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    /**
     * 1374. 生成每种字符都是奇数个的字符串
     *
     * @param n
     * @return
     */
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                sb.append("a");
            }
            sb.append("b");
        } else {
            for (int i = 0; i < n; i++) {
                sb.append("a");
            }
        }
        return sb.toString();
    }

    /**
     * 1365. 有多少小于当前数字的数字
     *
     * @param nums
     * @return
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = 0;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j != i && nums[j] < nums[i]) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }

    /**
     * 771. 宝石与石头
     *
     * @param jewels
     * @param stones
     * @return
     */
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int ans = 0;
        int n = stones.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            if (set.contains(stones.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }

    /**
     * 720. 词典中最长的单词（未完成）
     *
     * @param words
     * @return
     */
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {

        }
        return "";
    }

    /**
     * 661. 图片平滑器（未完成）
     *
     * @param img
     * @return
     */
    public int[][] imageSmoother(int[][] img) {
        int m = img[0].length;
        int n = img.length;
        int[][] arr = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = img[j][i], num = 1;
                //上
                if (i - 1 >= 0 && i - 1 < m) {
                    sum += img[j][i - 1];
                    num++;
                    if (j - 1 >= 0 && j - 1 <= n) {
                        sum += img[j - 1][i - 1];
                        num++;
                    }
                    if (j + 1 < n) {
                        sum += img[j + 1][i - 1];
                        num++;
                    }
                }
                //下
                if (i + 1 < m) {
                    sum += img[j][i + 1];
                    num++;
                    if (j - 1 >= 0 && j - 1 < n) {
                        sum += img[j - 1][i + 1];
                        num++;
                    }
                    if (j + 1 < n) {
                        sum += img[j + 1][i + 1];
                        num++;
                    }
                }
                //左
                if (j - 1 >= 0 && j - 1 < n) {
                    sum += img[j - 1][i];
                    num++;
                }

                //右
                if (j + 1 < n) {
                    sum += img[j + 1][i];
                    num++;
                }
                arr[j][i] = (int) Math.floor(sum / num);
            }
        }
        return arr;
    }

    /**
     * 682. 棒球比赛
     *
     * @param ops
     * @return
     */
    public int calPoints(String[] ops) {
        int ans = 0, j = 0;
        int n = ops.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ("+".equals(ops[i])) {
                list.add(list.get(j - 1) + list.get(j - 2));
                j++;
            } else if ("C".equals(ops[i])) {
                list.remove(j - 1);
                j--;
            } else if ("D".equals(ops[i])) {
                list.add(list.get(j - 1) * 2);
                j++;
            } else {
                list.add(Integer.parseInt(ops[i]));
                j++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i);
        }
        return ans;
    }

    /**
     * 693. 交替位二进制数
     *
     * @param n
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        String str = sb.toString();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 728. 自除数
     *
     * @param left
     * @param right
     * @return
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean flag = isTrue(i);
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isTrue(int n) {
        int temp = n;
        while (n > 0) {
            int num = n % 10;
            if (num == 0 || temp % num != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    /**
     * 762. 二进制表示中质数个计算置位
     *
     * @param left
     * @param right
     * @return
     */
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            int num = toBinary(i);
            boolean flag = isPrimeNum(num);
            if (flag) {
                ans++;
            }
        }
        return ans;
    }

    public int toBinary(int n) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        String str = sb.toString();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                sum++;
            }
        }
        return sum;
    }

    public boolean isPrimeNum(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * 796. 旋转字符串
     *
     * @param s
     * @param goal
     * @return
     */
    public boolean rotateString(String s, String goal) {
        int a = s.length();
        int b = goal.length();
        if (a != b) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (s.equals(goal)) {
            return true;
        }
        for (int i = 0; i < b; i++) {
            char c = sb.charAt(0);
            sb.delete(0, 1);
            sb.append(c);
            if (sb.toString().equals(goal)) {
                return true;
            }

        }
        return false;
    }

    public boolean rotateString1(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    /**
     * 804. 唯一摩尔斯密码词
     *
     * @param words
     * @return
     */
    public int uniqueMorseRepresentations(String[] words) {
        int ans = 0;
        String[] mos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(mos[words[i].charAt(j) - 'a']);
            }
            if (!set.contains(sb.toString())) {
                set.add(sb.toString());
                ans++;
            }
        }
        return ans;
    }

    /**
     * 819. 最常见的单词
     *
     * @param paragraph
     * @param banned
     * @return
     */
    public String mostCommonWord(String paragraph, String[] banned) {
//        paragraph = paragraph.replace(",", "");
        paragraph = paragraph.replace(".", "");
        paragraph = paragraph.replace("!", "");
        paragraph = paragraph.replace("?", "");
        paragraph = paragraph.replace("'", "");
        paragraph = paragraph.replace(";", "");
        paragraph = paragraph.toLowerCase();
        Set<String> set = new HashSet<>();
        for (int j = 0; j < banned.length; j++) {
            set.add(banned[j]);
        }
        Map<String, Integer> map = new HashMap<>();
        int num = 0;
        int len = paragraph.length();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (paragraph.charAt(i) != ' ' && paragraph.charAt(i) != ',') {
                sb.append(paragraph.charAt(i));
            } else {
                if (!set.contains(sb.toString()) && !sb.toString().equals("")) {
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                    if (map.get(sb.toString()) > num) {
                        num = map.get(sb.toString());
                        str = sb.toString();
                    }
                }
                sb = new StringBuilder();
            }
        }
        if (map.size() == 0) {
            return sb.toString();
        }

        return str;
    }


}
