class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int give = 1, i = 0;

        while (candies > 0) {
            res[i] += Math.min(give, candies);
            candies -= give;
            give++;
            i = (i + 1) % num_people;
        }

        return res;
    }
}
