package Solutions;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {

    // Brute force solution
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) continue;
//
//                if (nums[i] + nums[j] == target) {
//                    int[] solution = {i, j};
//                    return solution;
//                }
//            }
//        }
//        return null;
//    }

    // Optimized solution
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                int complementIndex = numMap.get(complement);
                if (i == complementIndex) {
                    continue;
                }
                return new int[] {i, complementIndex};
            }
        }

        throw new IllegalArgumentException("No match found");
    }
}
