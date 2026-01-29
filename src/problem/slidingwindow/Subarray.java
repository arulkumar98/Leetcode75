package problem.slidingwindow;

public class Subarray {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // 1️⃣ Sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // 2️⃣ Slide the window
        for (int end = k; end < nums.length; end++) {
            windowSum += nums[end];        // add new element
            windowSum -= nums[end - k];    // remove old element
            maxSum = Math.max(maxSum, windowSum);
        }

        // 3️⃣ Return average
        return (double) maxSum / k;
    }
}
