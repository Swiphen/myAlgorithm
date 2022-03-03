package com.feng;

import java.util.HashMap;
import java.util.Map;

public class HardSolution {
    /**
     * 4. 寻找两个正序数组的中位数（未完成）
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = nums1.length;
        int n = nums2.length;
        int sum = 0, j = 0, k = 0;
        int[][] nums = new int[m + n][2];

        for (int i = 0; i < m; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
        }
        for (; j < 1000; j++) {
            if (map.containsKey(j)) {
                nums[k][0] = j;
                nums[k][1] = map.get(j);
                k++;
                if (sum >= (m + n) / 2) {
                    j--;
                    break;
                }
                sum += map.getOrDefault(j, 0);
            }
        }
        if (j == 1000) {
            return 0;
        }
        if (m + n == 1) {
            return nums[0][0];
        }
        if (m + n == 2) {
            if (nums[0][1] > 1) {
                return nums[0][0];
            } else {
                return (double) (nums[0][0] + nums[1][0]) / 2;
            }
        }
        if ((m + n) % 2 == 1) {
            return j + 1;
        } else {
            if (sum - map.get(j) < (m + n) / 2) {
                if (map.get(j) > 1) {
                    return j;
                } else {
                    for (int g = 0; g < nums.length; g++) {
                        if (nums[g][0] == j) {
                            return (double) (j + nums[j][0]) / 2;
                        }
                    }
                }
            } else {
                for (int g = 0; g < nums.length; g++) {
                    if (g == j) {
                        return (j + nums[j][0]) / 2;
                    }
                }
            }
        }
        return 0;
    }
}
