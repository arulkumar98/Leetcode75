package problem.hashfunction;

import java.util.*;

public class EqualRowAndColumn {
    public int equalPairs(int[][] grid) {

        int len = grid.length;

        HashMap<String, Integer> map = new HashMap<>();

        for (int row = 0; row < len; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < len; col++) {
                sb.append(grid[row][col]).append(',');
            }
            String str = sb.toString();
            map.put(str,map.getOrDefault(str,0)+1);
        }

        int count = 0;

        for (int row = 0; row < len; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < len; col++) {
                sb.append(grid[col][row]).append(',');
            }
            String str = sb.toString();
            count += map.getOrDefault(str,0);
        }

        return count;
    }
}
