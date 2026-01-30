package problem.twopointer.p238;

public class p238 {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int pro = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j){
                    pro *= nums[j];
                }
            }
            arr[i] = pro;
            pro = 1;
        }
        return arr;

    }
}
