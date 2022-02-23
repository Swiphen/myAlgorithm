package com.feng.sum_of_nums;

import java.util.*;

public class SumOfNums {

    /**
     * 1. 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    /**
     * 15. 三数之和（未完成）
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (len < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    List<Integer> list = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                    }
                    if (list.size() == 3 && !ans.contains(list)) {
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }

}
