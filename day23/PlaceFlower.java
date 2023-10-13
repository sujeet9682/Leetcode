public class PlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;
        int l = flowerbed.length;
        if (l == 1 && flowerbed[0] == 0 && n <= 1)
            return true;
        int i = 0;
        if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
            n--;
            flowerbed[i] = 1;
            if (n == 0)
                return true;
        }
        for (i = 1; i < flowerbed.length; i++) {
            if (i - 1 >= 0 && flowerbed[i - 1] == 0 && flowerbed[i] == 0 && i + 1 < flowerbed.length
                    && flowerbed[i + 1] == 0) {
                n--;
                flowerbed[i] = 1;
                if (n == 0)
                    return true;
            }
        }
        if (flowerbed[l - 1] == 0 && flowerbed[l - 2] == 0) {
            n--;
            if (n == 0)
                return true;
        }
        return false;
    }
}
