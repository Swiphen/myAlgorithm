package com.feng;

import java.util.Arrays;

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
}
