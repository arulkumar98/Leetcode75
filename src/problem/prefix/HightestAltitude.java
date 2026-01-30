package problem.prefix;

public class HightestAltitude {
    public int pivotIndex(int[] nums) {
        //nums = [1, 7, 3, 6, 5, 6]
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
