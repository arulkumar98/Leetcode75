package problem.p238;

public class Optimal238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int leftPro = 1;
        int rightPro = 1;

        for (int i = len-1; i >= 0 ; i--) { // right to left
            ans[i] = rightPro;
            rightPro *=nums[i];   // previous right * current nums[i]
        }

        for (int i = 0; i < len; i++) {  // left to right
            ans[i] *= leftPro;         // to sore answer array we want multiple with ans array
            leftPro *= nums[i];
        }

        return ans;
    }
}
