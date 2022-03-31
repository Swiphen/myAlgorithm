package com.feng;

import java.util.*;

public class MidSolution {

    /**
     * 1131. 绝对值表达式的最大值     （超出时间限制）
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int len = arr1.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int n1 = Math.abs(arr1[i] - arr1[j]);
                int n2 = Math.abs(arr2[i] - arr2[j]);
                int n3 = Math.abs(i - j);
                max = Math.max(max, n1 + n2 + n3);
            }
        }
        return max;
    }

    //曼哈顿距离（未完成）
    public int maxAbsValExpr2(int[] arr1, int[] arr2) {
        int ans = 0;

        return ans;
    }

    /**
     * 419. 甲板上的战舰（未完成）
     *
     * @param board
     * @return
     */
    public int countBattleships(char[][] board) {
        int ans = 0;
        int m = board.length;
        int n = board[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);

            }
            System.out.println();
        }


        System.out.println();
        return ans;
    }

    /**
     * 475. 供暖器（未完成）
     *
     * @param houses
     * @param heaters
     * @return
     */
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        int m = houses.length;
        int n = heaters.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heaters[i], map.getOrDefault(heaters[i], 0));

        }

        return radius;
    }

    /**
     * 686. 重复叠加字符串匹配
     *
     * @param a
     * @param b
     * @return
     */
    public int repeatedStringMatch(String a, String b) {
        int ans = 1;
        int m = a.length();
        int n = b.length();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        while (m < n) {
            sb.append(a);
            ans++;
            m = sb.length();
        }
        if (sb.toString().contains(b)) {
            return ans;
        }
        sb.append(a);
        ans++;
        if (sb.toString().contains(b)) {
            return ans;
        }
        return -1;
    }


    /**
     * 1705. 吃苹果的最大数目（未完成）
     *
     * @param apples
     * @param days
     * @return
     */
    public int eatenApples(int[] apples, int[] days) {
        int ans = 0;


        return ans;
    }

    /**
     * 825. 适龄的朋友（未完成）
     *
     * @param ages
     * @return
     */
    public int numFriendRequests(int[] ages) {
        int ans = 0;
        Arrays.sort(ages);
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                if (i != j) {
                    if (ages[i] > ages[j] || (ages[i] <= ages[j] * 0.5 + 7)) {

                    } else {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * 846. 一手顺子（未完成）
     *
     * @param hand
     * @param groupSize
     * @return
     */
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        int len = hand.length;
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < len; i++) {
            maps.put(hand[i], maps.getOrDefault(hand[i], 0) + 1);
        }
        int flag = len / groupSize;
        Arrays.sort(hand);
//        maps.put(hand[0], maps.get(hand[0]) - 1);
        int n = 0;
        for (int j = 0; j < flag; j++) {
            n = 0;
            for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
                if (n != groupSize) {
                    if (map.getValue() > 0) {
                        if (maps.containsKey(map.getKey() + 1)) {
                            map.setValue(map.getValue() - 1);
                            n++;
                        }
                    }
                }
            }
        }

        return false;
    }

    /**
     * 306. 累加数（未完成）
     *
     * @param num
     * @return
     */
    public boolean isAdditiveNumber(String num) {

        return false;
    }

    /**
     * 334. 递增的三元子序列
     *
     * @param nums
     * @return
     */
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int n = nums.length;
        int first = nums[0], second = Integer.MAX_VALUE, num;
        for (int i = 0; i < n; i++) {
            num = nums[i];
            if (num > second) {
                return true;
            } else if (num > first) {
                second = num;
            } else {
                first = num;
            }
        }
        return false;
    }

    /**
     * 373. 查找和最小的K对数字（未完成）
     *
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        return list;
    }

    /**
     * 539. 最小时间差（未完成）
     *
     * @param timePoints
     * @return
     */
    public int findMinDifference(List<String> timePoints) {


        return 0;
    }

    /**
     * 2029. 石子游戏 IX（未完成）
     *
     * @param stones
     * @return
     */
    public boolean stoneGameIX(int[] stones) {
        int sum = 0, flag = 0;      // flag：  Alice:奇数    Bob:偶数
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(stones);
        for (int i = 0; i < stones.length; i++) {
            arr.add(stones[i]);
        }
//        List<Integer> list = myTurn(arr, sum);
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        while ((list.get(1) != -1) && (flag < stones.length)) {
            list = myTurn(arr, sum);
            int n = list.get(0);
            sum += arr.get(n);
            arr.remove(n);
            flag++;
        }
        if (flag % 2 == 0) {
            if (sum % 3 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public List<Integer> myTurn(List<Integer> arr, int sum) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if ((sum + arr.get(i)) % 3 != 0) {
                sum += arr.get(i);
                list.add(i);
                list.add(sum);
                return list;
            }
        }
        list.add(0);
        list.add(-1);

        return list;
    }

    /**
     * 1447. 最简分数
     *
     * @param n
     * @return
     */
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int gcd = gcd(j, i);
                String str = j / gcd + "/" + i / gcd;
                if (!list.contains(str)) {
                    list.add(str);
                }
            }
        }
        return list;
    }

    //辗转法求最大公约数
    public int gcd(int x, int y) {
        int temp;
        while (y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    /**
     * 1020. 飞地的数量（未完成）
     *
     * @param grid
     * @return
     */
    public int numEnclaves(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }


        for (int i = 0; i < m; i++) {
            boolean on = true;
            boolean down = true;
            boolean left = true;
            boolean right = true;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    //上
                    if ((i - 1 >= 0) && grid[i - 1][j] == 1) {
                        on = false;
                    }
                    //下
                    if ((i + 1 < n) && grid[i + 1][j] == 1) {
                        down = false;
                    }
                    //左
                    if ((j - 1 >= 0) && grid[i][j - 1] == 1) {
                        left = false;
                    }
                    //右
                    if ((j + 1 < m) && grid[i][j + 1] == 1) {
                        right = false;
                    }

                }
            }
        }
        return ans;
    }

    /**
     * 540. 有序数组中的单一元素
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    /**
     * 688. 骑士在棋盘上的概率（未完成）
     *
     * @param n
     * @param k
     * @param row
     * @param column
     * @return
     */
    public double knightProbability(int n, int k, int row, int column) {
        double ans = 0;


        return ans;
    }

    /**
     * 537. 复数乘法
     *
     * @param num1
     * @param num2
     * @return
     */
    public String complexNumberMultiply(String num1, String num2) {
        int[] n1 = complexNum(num1);
        int[] n2 = complexNum(num2);

        return (n1[0] * n2[0] - n1[1] * n2[1]) + "+" + (n1[0] * n2[1] + n1[1] * n2[0]) + "i";
    }

    public int[] complexNum(String s) {
        int a = 0, b = 0;
        if (s.contains("+")) {
            String[] str1 = s.split("\\+");
            a = Integer.parseInt(str1[0]);
            b = Integer.parseInt(str1[1].split("i")[0]);
        } else if (s.contains("i")) {
            b = Integer.parseInt(s.split("i")[0]);
        } else {
            a = Integer.parseInt(s);
        }
        return new int[]{a, b};
    }

    public String complexNumberMultiply2(String num1, String num2) {
        String[] s1 = num1.split("\\+|i");
        String[] s2 = num2.split("\\+|i");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1]);
        return (a * c - b * d) + "+" + (a * d + b * c) + "i";
    }

    /**
     * 6. Z 字形变换
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        int n = s.length(), flag = 0, m = 1, a = 0;
        String[][] arr = new String[numRows][n];
        StringBuilder sb = new StringBuilder();
        if (numRows == 1) {
            return s;
        }
        if (numRows == 2) {
            for (int i = 0; i < n; i += 2) {
                sb.append(s.charAt(i));
            }
            for (int i = 1; i < n; i += 2) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < numRows; i++) {
                if ((m == numRows - 1)) {
                    m = 1;
                    a += numRows - 1;
                }
                if (flag < n) {
                    if ((j == 0) || (j == a)) {
                        arr[i][j] = s.charAt(flag) + "";
                        flag++;
                    } else {
                        if (numRows - m - 1 < 0) {
                            m = 0;
                        }
                        arr[numRows - m - 1][j] = s.charAt(flag) + "";
                        m++;
                        flag++;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != null) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
                if (arr[i][j] != null) {
                    sb.append(arr[i][j]);
                }
            }
            System.out.println();
        }

        return sb.toString();
    }


    /**
     * 2104. 子数组范围和
     *
     * @param nums
     * @return
     */
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int max = nums[i];
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                ans += (max - min);
            }
        }
        return ans;
    }

    /**
     * 2055. 蜡烛之间的盘子（未完成）
     *
     * @param s
     * @param queries
     * @return
     */
    public int[] platesBetweenCandles(String s, int[][] queries) {


        return null;
    }

    /**
     * 2100. 适合打劫银行的日子（未完成）【超时】
     *
     * @param security
     * @param time
     * @return
     */
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list = new ArrayList<>();
        int n = security.length;
        int flag1, flag2;

        for (int i = time; i <= n - time - 1; i++) {
            flag1 = 1;
            flag2 = 1;
            //左边非递增
            for (int j = i - time; j < i; j++) {
                if (security[j] < security[j + 1]) {
                    flag1 = 0;
                    break;
                }
            }
            //右边非递减
            if (flag1 == 1) {
                for (int k = i; k < i + time; k++) {
                    if (security[k] > security[k + 1]) {
                        flag2 = 0;
                        break;
                    }
                }
            }
            if (flag1 == 1 && flag2 == 1) {
                list.add(i);
            }
        }
        return list;
    }


    /**
     * 5. 最长回文子串（未完成）
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                sb.append(s.charAt(j));
                if (!"".equals(palindrome(sb.toString()))) {
                    list.add(sb.toString());
                }
            }

        }
        if (list.size() > 0) {
            String str = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                str = str.length() > list.get(i).length() ? str : list.get(i);
            }
            return str;
        }

        return s;
    }

    public String palindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if (s.equals(sb.toString())) {
            return s;
        }
        return "";
    }

    /**
     * 2024. 考试的最大困扰度（未完成）
     *
     * @param answerKey
     * @param k
     * @return
     */
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int len = answerKey.length();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int t = 0, f = 0;

        return 0;
    }

    /**
     * 172. 阶乘后的零（未完成）
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int num = 0;
        long sum = 1;
        while (n > 0) {
            sum *= n;
            n--;
        }
        String str = String.valueOf(sum);
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == '0') {
                num++;
            } else {
                return num;
            }
        }
        return num;
    }

}
