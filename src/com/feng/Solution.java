package com.feng;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

}
