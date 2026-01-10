package problem.p11;

public class MostWater {
    public int maxArea(int[] height) {
        int tank = 0;
        int left = 0;
        int right = height.length-1;

        while (left < right){
            int f1 = 0;
            int f2 = 0;

            f1 = Math.min(height[left], height[right]);
            f2 = right - left;
            tank = Math.max(tank, (f1*f2));

            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }

        }
        return tank;

    }

    class Solution {
        public int maxArea(int[] height) {
            int max = 0;
            int left = 0, right = height.length - 1;

            while (left < right) {
                int area = Math.min(height[left], height[right]) * (right - left);
                max = Math.max(max, area);

                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
    }

}
