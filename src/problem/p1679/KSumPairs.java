package problem.p1679;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KSumPairs {
    public int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        int ans = 0;

        Arrays.sort(nums);

        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == k){
                ans++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
    public int maxOperations2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int need = k - num;

            if (map.getOrDefault(need, 0) > 0) {
                count++;
                map.put(need, map.get(need) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}
