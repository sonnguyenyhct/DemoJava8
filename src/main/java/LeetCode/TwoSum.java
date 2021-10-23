package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length;i++){
            sum.put(i,nums[i]);
            if (sum.containsValue(target - nums[i]) && target - nums[i] != nums[i] ){
                return new int[] {i,sum.get(target - nums[i])};
            }
        }
        return null;
    }

}
