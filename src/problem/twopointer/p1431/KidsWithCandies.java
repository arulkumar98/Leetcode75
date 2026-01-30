package problem.twopointer.p1431;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        for (int candy : candies){
            if (max < candy){
                max = candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                ans.add(true);

            } else ans.add(false);
        }


        return ans;
    }
}
