package problem.twopointer.p334;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int current : nums) {
            if (current <= first) {
                first = current;            // smaller first candidate
            } else if (current <= second) {
                second = current;           // better second candidate
            } else {
                // current > second > first
                return true;
            }
        }

        return false;
    }
}