package problem.p605;

public class Flower2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            // If current spot is empty
            if (flowerbed[i] == 0) {

                // Check left: (i==0) or left is 0
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);

                // Check right: (i==last) or right is 0
                boolean right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // Both neighbors empty → we can plant
                if (left && right) {
                    flowerbed[i] = 1;  // plant
                    n--;

                    if (n <= 0) return true;  // early return
                }
            }
        }

        return n <= 0;
    }
}
