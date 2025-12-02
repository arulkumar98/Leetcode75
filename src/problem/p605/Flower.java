package problem.p605;

 public class Flower {


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int index = 0;
        while (index < flowerbed.length) {
            int plant = index;
            if (flowerbed[plant] == 0 && checkSport(index, flowerbed)) {
                flowerbed[plant] = 1;
                n--;
            }
            index++;
        }
        return n == 0;
    }

    private boolean checkSport(int index, int[] flowerbed) {
        //single case
        if (index == 0 && index + 1 == flowerbed.length) {
            return true;
        }
        //right case
        if (index == 0 && flowerbed[index + 1] == 0) {
            return true;
        }
        //left case
        if (index == flowerbed.length - 1 && flowerbed[index - 1] == 0) {
            return true;
        }
        //common case
        return index != 0 && flowerbed[index - 1] == 0 &&   index+1 < flowerbed.length && flowerbed[index + 1] == 0;
    }
}
