class Solution {
    public int maxDistinct(String s) {
        boolean[] res = new boolean[26];
        int Count = 0;
        for (int i = 0; i < s.length(); i++) {
            int Idx = s.charAt(i) - 'a';
            if (!res[Idx]) {
                res[Idx] = true;
                Count++;
            }
        }
        return Count;
    }
}
