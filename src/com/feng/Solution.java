package com.feng;

import java.util.*;

public class Solution {

    /**
     * 223.矩形面积
     *
     * @param ax1
     * @param ay1
     * @param ax2
     * @param ay2
     * @param bx1
     * @param by1
     * @param bx2
     * @param by2
     * @return
     */
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int result = 0;

        int width = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int height = Math.min(ay2, by2) - Math.max(ay1, by1);

        //s1：第一个矩形面积 s2：第二个矩形面积 s3：重叠面积
        int s1 = (ax2 - ax1) * (ay2 - ay1);
        int s2 = (bx2 - bx1) * (by2 - by1);
        int s3 = Math.max(width, 0) * Math.max(height, 0);
        result = s1 + s2 - s3;

        return result;
    }

    /**
     * 217. 存在重复元素
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 53. 最大子序和
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            max = Math.max(max, sum);
        }
        return max;
    }

    /**
     * 1. 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int n1 = 0, n2 = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            n1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if ((n1 + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * 88. 合并两个有序数组
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length;
        while (n > 0) {
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[--i] = nums1[--m];
            } else {
                nums1[--i] = nums2[--n];
            }
        }
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    /**
     * 453. 最小操作次数使数组元素相等
     *
     * @param nums
     * @return
     */
    public int minMoves(int[] nums) {
        int count = 0;
        int min = Arrays.stream(nums).min().getAsInt();
        for (int num : nums) {
            count += num - min;
        }
        return count;
    }

    /**
     * 66. 加一
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        for (int i = n; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    /**
     * 121. 买卖股票的最佳时机
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

    /**
     * 229. 求众数 II
     *
     * @param nums
     * @return
     */
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0, temp = nums[0];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != temp) {
                if (count > (n / 3)) {
                    list.add(nums[i - 1]);
                }
                temp = nums[i];
                count = 0;
            }
            count++;
        }
        if (count > (n / 3)) {
            list.add(nums[n - 1]);
        }
        return list;
    }

    /**
     * 摩尔投票法
     *
     * @param nums
     * @return
     */
    public List<Integer> majorityElement2(int[] nums) {
        int e1 = 0;
        int e2 = 0;
        int v1 = 0;
        int v2 = 0;
        for (int num : nums) {
            if (v1 > 0 && e1 == num) {
                v1++;
            } else if (v2 > 0 && e2 == num) {
                v2++;
            } else if (v1 == 0) {
                e1 = num;
                v1++;
            } else if (v2 == 0) {
                e2 = num;
                v2++;
            } else {
                v1--;
                v2--;
            }
        }
        int c1 = 0, c2 = 0, n = nums.length / 3;
        for (int num : nums) {
            if (v1 > 0 && e1 == num) {
                c1++;
            }
            if (v2 > 0 && e2 == num) {
                c2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if (v1 > 0 && c1 > n) {
            list.add(e1);
        }
        if (v2 > 0 && c2 > n) {
            list.add(e2);
        }
        return list;
    }

    /**
     * 566. 重塑矩阵
     *
     * @param mat
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = 0;     //行
        int n = 0;  //列
        int sum = mat.length * mat[0].length;
        //判断是否符合要求
        if (sum != r * c) {
            for (int[] nums : mat) {
                for (int num : nums) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return mat;
        }
        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (n == mat[m].length) {
                    m++;
                    n = 0;
                }
                res[i][j] = mat[m][n];
                n++;
            }
        }
        for (int[] nums : res) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return res;
    }

    public int[][] matrixReshape2(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            res[i / c][i % c] = mat[i / n][i % n];
        }
        return res;
    }

    /**
     * 74. 搜索二维矩阵
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int i = 0;
        for (; i < m; i++) {
            int n = matrix[i].length;
            if (target <= matrix[i][n - 1]) {
                for (int num : matrix[i]) {
                    if (num == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 496. 下一个更大元素 I
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] res = new int[length1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length2 - 1; i++) {
            map.put(nums2[i], -1);
            for (int j = i + 1; j < length2; j++) {
                if (nums2[i] < nums2[j]) {
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }
        map.put(nums2[length2 - 1], -1);
        for (int i = 0; i < length1; i++) {
            int temp = map.get(nums1[i]);
            res[i] = temp;
        }
        for (int n : res) {
            System.out.print(n + " ");
        }
        return res;
    }

    /**
     * 单调栈
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            //比较大小
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                //小的踢出去
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
            System.out.print(res[i] + " ");
        }
        return res;
    }

    /**
     * 118. 杨辉三角
     *
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }

    /**
     * 575. 分糖果
     *
     * @param candyType
     * @return
     */
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int n = candyType.length / 2;
        for (int i : candyType) {
            set.add(i);
        }
        return set.size() < n ? set.size() : n;
    }

    /**
     * 237. 删除链表中的节点
     *
     * @param node
     */
    public void deleteNode(ListNode_1 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * 2. 两数相加
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode_2 addTwoNumbers(ListNode_2 l1, ListNode_2 l2) {
        ListNode_2 res = new ListNode_2();
        int n1 = 0, n2 = 0;

        System.out.println(n1);
        return res;
    }

    /**
     * 367. 有效的完全平方数
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
//        //1.使用sqrt()方法
//        int n = (int) Math.sqrt(num);
//        return n * n == num;

//        //2.暴力解法
//        long x = 1, square = 1;
//        while (square <= num) {
//            if (square == num) {
//                return true;
//            }
//            x++;
//            square = x * x;
//        }
//        return false;

        //3.二分查找
        int left = 0, right = num;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            long square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 1218. 最长定差子序列
     *
     * @param arr
     * @param difference
     * @return
     */
    public int longestSubsequence(int[] arr, int difference) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (temp + difference == arr[j]) {
                    list.add(arr[j]);
                    temp = arr[j];
                }
            }
            System.out.println(list.toString());
            res = res > list.size() ? res : list.size();
        }
        return res;
    }

    public int longestSubsequence1(int[] arr, int difference) {
        int res = 0;
        Map<Integer, Integer> dp = new HashMap<>();
        for (int n : arr) {
            dp.put(n, dp.getOrDefault(n - difference, 0) + 1);
            res = Math.max(res, dp.get(n));
        }
        return res;
    }

    /**
     * 268. 丢失的数字
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int res = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return res;
    }

    public int missingNumber1(int[] nums) {
        int n = nums.length, sum = 0;
        sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    /**
     * 299. 猜数字游戏
     *
     * @param secret
     * @param guess
     * @return
     */
    public String getHint(String secret, String guess) {
        int num1 = 0, num2 = 0, i = 0;
        char[] c1 = secret.toCharArray();
        char[] c2 = guess.toCharArray();
        char[] c3 = new char[c2.length];
        int n1 = secret.length() - 1, n2 = guess.length() - 1;
        Map<Character, Integer> map = new HashMap<>();
        while (n1 >= 0 && n2 >= 0) {
            if (c1[n1] == c2[n2]) {
                num1++;
            } else {
                c3[i] = c2[n2];
                i++;
                if (!map.containsKey(c1[n1])) {
                    map.put(c1[n1], 1);
                } else {
                    map.put(c1[n1], map.get(c1[n1]) + 1);
                }
            }
            n1--;
            n2--;
        }
        for (char c : c3) {
            if (map.containsKey(c)) {
                if (map.get(c) != 0) {
                    num2++;
                    map.put(c, map.get(c) - 1);
                }
            }
        }
        String res = num1 + "A" + num2 + "B";
        return res;
    }

    public String getHint2(String secret, String guess) {
        int n = secret.length();
        int a = 0, b = 0;
        int[] cnt1 = new int[10];
        int[] cnt2 = new int[10];
        for (int i = 0; i < n; i++) {
            int c1 = secret.charAt(i) - '0', c2 = guess.charAt(i) - '0';
            if (c1 == c2) {
                a++;
            } else {
                cnt1[c1]++;
                cnt2[c2]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            b += Math.min(cnt1[i], cnt2[i]);
        }
        return a + "A" + b + "B";
    }

    /**
     * 495. 提莫攻击
     *
     * @param timeSeries
     * @param duration
     * @return
     */
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0, n = timeSeries.length;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                if (timeSeries[i + 1] - timeSeries[i] < duration) {
                    res += timeSeries[i + 1] - timeSeries[i];
                } else {
                    res += duration;
                }
            } else {
                res += duration;
            }
        }
        return res;
    }

    /**
     * 剑指 Offer II 001. 整数除法
     *
     * @param a
     * @param b
     * @return
     */
    public int divide(int a, int b) {
        int res = 0;

        return res;
    }

    /**
     * 375. 猜数字大小 II
     *
     * @param n
     * @return
     */
    public int getMoneyAmount(int n) {
        return dfs(1, n);
    }

    static int N = 210;
    static int[][] cache = new int[N][N];

    int dfs(int l, int r) {
        if (l >= r) {
            return 0;
        }
        if (cache[l][r] != 0) {
            return cache[l][r];
        }
        int ans = 0x3f3f3f3f;
        for (int x = l; x <= r; x++) {
            int cur = Math.max(dfs(l, x - 1), dfs(x + 1, r)) + x;
            ans = Math.min(ans, cur);
        }
        cache[l][r] = ans;
        return ans;
    }


    /**
     * 397. 整数替换
     *
     * @param n
     * @return
     */
    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        }
        return 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1));
    }

    /**
     * 594. 最长和谐子序列
     *
     * @param nums
     * @return
     */
    public int findLHS(int[] nums) {
        int res = 0, n = nums.length;
        Arrays.sort(nums);
        for (int m : nums) {
            System.out.print(m + " ");
        }
        for (int i = 0, j = 0; j < n; j++) {
            while (i < j && nums[j] - nums[i] > 1) {
                i++;
            }
            if (nums[j] - nums[i] == 1) {
                res = Math.max(res, j - i + 1);
            }
        }

        return res;
    }

    /**
     * 859. 亲密字符串
     *
     * @param s
     * @param goal
     * @return
     */
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int[] c1 = new int[26];
        int[] c2 = new int[26];
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int a = s.charAt(i) - 'a';
            int b = goal.charAt(i) - 'a';
            c1[a]++;
            c2[b]++;
            if (a != b) {
                sum++;
            }
        }
        boolean ok = false;
        for (int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
            if (c1[i] > 1) {
                ok = true;
            }
        }

        return sum == 2 || (sum == 0 && ok);
    }

    /**
     * 423. 从英文中重建数字
     *
     * @param s
     * @return
     */
    public String originalDigits(String s) {
//        String ans = "";
//        String[] ss = new String[]{"zeno", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<Character, Integer> flag = new HashMap<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        int[] nums = new int[10];
        nums[0] = map.getOrDefault('z', 0);
        nums[2] = map.getOrDefault('w', 0);
        nums[4] = map.getOrDefault('u', 0);
        nums[6] = map.getOrDefault('x', 0);
        nums[8] = map.getOrDefault('g', 0);
        nums[5] = map.getOrDefault('f', 0) - nums[4];
        nums[3] = map.getOrDefault('h', 0) - nums[8];
        nums[7] = map.getOrDefault('s', 0) - nums[6];
        nums[1] = map.getOrDefault('o', 0) - nums[0] - nums[2] - nums[4];
        nums[9] = map.getOrDefault('i', 0) - nums[5] - nums[6] - nums[8];


        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < nums[i]; j++) {
                ans.append((char) (i + '0'));
            }
        }

        return ans.toString();
    }


}
