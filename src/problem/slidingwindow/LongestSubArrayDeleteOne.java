package problem.slidingwindow;

public class LongestSubArrayDeleteOne {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeros = 0;
        int maxLen = 0;
        //[0, l 1,1,1,0,  l1,1,  0,1]

        for (int right = 0; right < nums.length; right++) {

            // Step 1: expand window
            if (nums[right] == 0) {
                zeros++;
            }

            // Step 2: shrink if more than one zero
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            // Step 3: delete one element → subtract 1
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
