package com.feng;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    //曼哈顿距离
    public int maxAbsValExpr2(int[] arr1, int[] arr2) {
        int ans = 0;

        return ans;
    }

    /**
     * 419. 甲板上的战舰
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
     * 475. 供暖器
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
            for (int j = 0; j < m; j++) {
                if (houses[j] <= heaters[i]) {
                    map.put(heaters[i], heaters[i] - houses[j]);
                } else {
                    continue;
                }
            }
        }


        return radius;
    }
}
