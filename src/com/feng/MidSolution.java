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

}
