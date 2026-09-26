package greedy;

public class canPlaceflower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(len == 1) {
            if(flowerbed[0] == 0)
                n--;
            return n <= 0;
        }

        // First
        if(n > 0 && flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        // Middle
        for(int i = 1; i < len - 1; i++) {
            if(n > 0 &&
               flowerbed[i] == 0 &&
               flowerbed[i-1] == 0 &&
               flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        // Last
        if(n > 0 &&
           flowerbed[len-1] == 0 &&
           flowerbed[len-2] == 0) {
            flowerbed[len-1] = 1;
            n--;
        }
        return n <= 0;
    }
}
