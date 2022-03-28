package com.feng;

public class Dynamic {

    /**
     * 509. 斐波那契数【递归】
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * 【动态规划】
     *
     * @param n
     * @return
     */
    public int fib2(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = q + p;
        }
        return r;
    }

    /**
     * 1137. 第 N 个泰波那契数【动态规划】
     *
     * @param n
     * @return
     */
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int p = 0, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }

    /**
     * 【递归】记忆化搜索
     *
     * @param n
     * @return
     */
    int[] cache = new int[40];  //防止重复计算

    public int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        cache[n] = tribonacci2(n - 1) + tribonacci2(n - 2) + tribonacci2(n - 3);
        return cache[n];
    }

    /**
     * 70. 爬楼梯（未完成）
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        
        return 0;
    }
}
