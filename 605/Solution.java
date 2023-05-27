class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}

/*
flowerbed = [1,0,0,0,1] and n = 2
In this condition, three checks are performed for each plot i:

flowerbed[i] == 0 checks if the current plot is empty.
(i == 0 || flowerbed[i-1] == 0) checks if the plot to the left is either non-existent (when i == 0) or empty.
(i == flowerbed.length - 1 || flowerbed[i+1] == 0) checks if the plot to the right is either non-existent (when i == flowerbed.length - 1) or empty.
If all these conditions are met, we can plant a flower in the current plot and decrease n by 1.

Now, let's walk through the flowerbed = [1,0,0,0,1] and n = 2 example:

For i = 0:
flowerbed[i] == 0 is false because flowerbed[0] is 1, so we skip this plot.
For i = 1:
flowerbed[i] == 0 is true because flowerbed[1] is 0.
i == 0 || flowerbed[i-1] == 0 is true because flowerbed[0] is 1, but we have i != 0 which means we are not at the start of the flowerbed array and flowerbed[i-1] is 1, not 0, so the entire condition is false.
We skip this plot because not all conditions are true.
For i = 2:
flowerbed[i] == 0 is true because flowerbed[2] is 0.
i == 0 || flowerbed[i-1] == 0 is true because flowerbed[1] is 0.
i == flowerbed.length - 1 || flowerbed[i+1] == 0 is true because flowerbed[3] is 0.
All conditions are true, so we plant a flower in this plot and decrease n to 1.
For i = 3:
The conditions are the same as for i = 2, but since we've just planted a flower in the i = 2 plot, flowerbed[i-1] == 0 is false.
We skip this plot.
For i = 4:
flowerbed[i] == 0 is false because flowerbed[4] is 1.
We skip this plot.
In the end, n is 1, meaning we were unable to plant all 2 flowers, so the function would return false. */